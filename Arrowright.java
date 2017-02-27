import greenfoot.*; 

public class Arrowright  extends Moveable
   {
    private int speed;
    private int right;
    private int beginning;
    private int turn;
    private int starty;
    public Arrowright(int b, int r, int s, int t, int y)
       {
        right=r;
        speed=s;
        beginning=b;
        turn=t;
        starty=y;
       }
    public void act()
       {
        turnArrow();
        move(speed);
        deleteArrowLeft();
       }   
    public void resetArrow()
       {
        if(getX()>=right)
           {
            setLocation(beginning,starty);
           }
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
        if(getX()>=right)
           {
            ((CastleBusters)getWorld()).deleteBullet(this);
           }
       }
   }