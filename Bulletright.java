import greenfoot.*;  
public class Bulletright  extends Moveable
   {
   private boolean Stone;
   private boolean guard;
   private boolean dead;
   private int smokeCount;
   public Bulletright()
      {
      super();
      Stone=false;
      guard=false;
      dead=false;
      }
    public void act()
       {
        move(10);
        checkObjects();
        
        checkEdge();
       }
   
    public void checkObjects()
       {
        Actor actor = this.getOneIntersectingObject(Actor.class);
        if (actor instanceof Stone||actor instanceof Archer)
           {
            if(actor instanceof Archer || actor instanceof Stone )
               {
                ((CastleBusters)getWorld()).deleteEnemy(actor);
               }
            delete();
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

