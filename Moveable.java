import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * A Moveable is an actor that can 'move' and 'turn'
 * When moving, the Mover will move in the direction 
 * it is currently facing.
 * 
 * Both 'move' and 'turn' methods are available with or without parameters.
 * 
 * 
 * 
 */
public class Moveable extends Actor
{
    private static final double WALKING_SPEED = 5.0;
    
    /**
     * Turns (clockwise).
     */
    public void turn()
    {
        turn(90);
    }
    

    /**
     * Turn 'angle' degrees (clockwise).
     */
    public void turn(int angle)
    {
        setRotation(getRotation() + angle);
    }
   
    public void move()
    {
        move(WALKING_SPEED);
    }

    
    /**
     * Move a certain distance forward in the current direction.
     */
    public void move(double distance)
    {
        double angle = Math.toRadians( getRotation() );
        int x = (int) Math.round(getX() + Math.cos(angle) * distance);
        int y = (int) Math.round(getY() + Math.sin(angle) * distance);
        
        setLocation(x, y);
    }

    
    /**
     * Tests if an object is at the edge of the world
     */
    public boolean atWorldEdge()
    {
        if(getX() <= 1 || getX() >= getWorld().getWidth()-5)
            return true;
        if(getY() <= 1 || getY() >= getWorld().getHeight()-5)
            return true;
        else
            return false;
    }
    
    
    public Actor getoneIntersectingObject(Actor a) 
    {
      if(intersectionHelp(a) == 0)
         {
         return a;
            
         }
      else {
          return null;
      }
    }
    
    
    public int intersectionHelp(Actor a) 
    {
    return this.getX() * a.getX() + this.getY() * a.getY();
    }
}
