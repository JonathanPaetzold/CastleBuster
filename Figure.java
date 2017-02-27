import greenfoot.*;

public class Figure  extends Moveable implements Movers
{

    private int speed;
    private int vSpeed;
    private int acceleration;
    private int jumpStrength;
    private int max;
    private int direction;
    private int counterleft;
    private int counterright;
    private int counter;
    private int delay;
    
    public Figure()
       {
       
       speed=7;
       vSpeed=0;
       acceleration=2;
       jumpStrength=-17;
       max=10;
       direction = 0;
       counterleft=0;
       counterright=0;
       counter=0;
       delay=20;
    
       }
    
    public void act()
       {
        checkKeys();
        checkFall();
        checkGround();
        moveGround();
        checkKillers();
        win();
        
       }
    
    private void checkKeys()
       {
        if(Greenfoot.isKeyDown("left")&&!StoneLeft())
           {
            moveLeft();
            counterleft++;
            direction=2;
            
            if(counterleft==0)
               {
                setImage("playerleft.png");
               }
            if(counterleft==2)
               {
                setImage("playerleft.png");
               }
            if(counterleft==3)
               {
                setImage("playerleft.png");
               }
            if(counterleft==5)
               {
                setImage("playerleft.png");
               }
            if(counterleft==6)
               {
                counterleft=0;
               }
           }
        if(Greenfoot.isKeyDown("right")&&!StoneRight())
           {
            moveRight();
            counterright++;
            direction=1;
            
            if(counterright==0)
               {
                setImage("player.png");
               }
            if(counterright==2)
               {
                setImage("player.png");
               }
            if(counterright==3)
               {
                setImage("player.png");
               }
            if(counterright==5)
               {
                setImage("player.png");
               }
            if(counterright==6)
               {
                counterright=0;
               }
           }
        if(Greenfoot.isKeyDown("up"))
           {       
            jump();
           }
        if(Greenfoot.isKeyDown("f") && counter > delay)
           {
            fire();
            counter = 0;
           }
            counter++;
    }
    public boolean canSee(Class clss)
       {
        Actor actor = getOneIntersectingObject(clss);
        return actor != null;     
       }
    
    public void moveGround()
        {
        if(getY()>=239)
           {
           setLocation(getX(),238);
           }
       }
    public boolean onGround()
       {
        Ground a = (Ground) getOneObjectAtOffset(0,24,Ground.class);
        return a !=null;
       }
    public boolean onGround2()
       {
        Ground2 a = (Ground2) getOneObjectAtOffset(0,24,Ground2.class);
        return a !=null;
       }
    public boolean onStone()
       {
        Stone a = (Stone) getOneObjectAtOffset(0,27,Stone.class);
        return a !=null;
       }
   
    public void checkGround()
       {
        if(onGround()||onGround2()||onStone())
           {
            vSpeed=0;
           }
        else
           {
            fall();
           }
       }
    public void jump()
       {
        if(onGround()||onGround2()||onStone()) 
           {
            vSpeed=jumpStrength;
            fall();
           }
       }
    public void fall()
       {
        setLocation(getX(),getY()+vSpeed);
        vSpeed=vSpeed+acceleration;
        if(vSpeed>10)
           {
            vSpeed=10;
           }
       }
    
    public boolean StoneRight()
       {
        Stone a = (Stone) getOneObjectAtOffset(15,0,Stone.class);
        return a !=null;
       }
    public boolean StoneLeft()
       {
        Stone a = (Stone) getOneObjectAtOffset(-15,0,Stone.class);
        return a !=null;
       }

    public void die()
       {
        setLocation(100,100);
        vSpeed=0;
       }
    public void checkFall()
       {
        if(getY()==299)
           {
            die();
           }
       }
    public void checkKillers()
       {
        if(canSee(Arrowleft.class)||canSee(Arrowright.class))
           {
            setLocation(45,238);
           }
       }
   
    public void win()
       {
        Actor LevelEnd = getOneIntersectingObject(LevelEnd.class);
        if(canSee(LevelEnd.class))
           {
            ((CastleBusters)getWorld()).addLevel();
           }
       }
    
    public void moveRight()
       {
        setLocation(getX()+speed,getY());
       }
    public void moveLeft()
       {
        setLocation(getX()-speed,getY());
       }
    public void fire()
       {
        if(direction==1)
           {
            ((CastleBusters)getWorld()).addBulletright(getX()+15, getY());
           }
        if(direction==2)
           {
            ((CastleBusters)getWorld()).addBulletleft(getX()-15, getY());
           }
       }  
   }
