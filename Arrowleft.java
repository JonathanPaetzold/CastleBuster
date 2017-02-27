import greenfoot.*; 

public class Arrowleft  extends Moveable
   {
    private int speed;
    private int left;
    private int beginning;
    private int turn;
    private int starty;
    public Arrowleft(int b, int l, int s, int t, int y)
       {
        left=l;
        speed=s;
        beginning=b;
        turn=t;
        starty=y;
       }
    public void act()
       {
        turnArrow();
        move(-speed);
        deleteArrowLeft();
       }  
    public void turnArrow()
       {
        if(getRotation()==0)
           {
           turn(turn);
           }
       }
    public void deleteArrowLeft()
       {
        if(getX()<=left || getY() >= 290)
           {
            ((CastleBusters)getWorld()).deleteBullet(this);
           }
       }
   }