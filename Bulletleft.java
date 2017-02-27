import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Bulletleft  extends Moveable
   {
   private boolean Stone;
   private boolean guard;
   private boolean dead;
   private int smokeCount;
   public Bulletleft()
      {
      super();
      Stone=false;
      guard=false;
      dead=false;
      }
   public void act()
      {
      move(-10);
      checkObjects();
      checkEdge();
      }
    
    public void checkObjects()
       {
        Actor actor = this.getOneIntersectingObject(Actor.class);
        if (actor instanceof Stone||actor instanceof Archer)
           {
            if(actor instanceof Archer || actor instanceof Stone)
               {
                ((CastleBusters)getWorld()).deleteEnemy(actor);
               } 
            ((CastleBusters)getWorld()).deleteBullet(this);
            dead=true;
           }
       }
    public void checkEdge()
       {
        if(!dead&&atWorldEdge())
           {
            delete();
           }
       }
    public void delete()
       {
        ((CastleBusters)getWorld()).deleteBullet(this);
       }
}

