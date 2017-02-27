import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Archer  extends Enemies
{
    private int ctr;
    private int arrowstopPoint;
    private int arrowspeed;
    private int arrowAngle;
    private int startCounter;
    private int vSpeed;
    private int acceleration;
    
   
    public Archer (int stopPoint, int speed, int angle, int start)
       {
        ctr = 30;
        arrowstopPoint = stopPoint;
        arrowspeed = speed;
        arrowAngle = angle;
        startCounter=start;
        vSpeed = 0;
        acceleration = 2;
        
       }
    public void act()
       {
        createArrowLeft();
        checkGround();
        
       }     
    public void createArrowLeft()
       {
        ctr++;
        if(ctr>=startCounter)
           {
            ((CastleBusters)getWorld()).addObject(new Arrowleft(this.getX(), arrowstopPoint, arrowspeed, arrowAngle, this.getY()), this.getX(), this.getY());
            ctr=0;
            
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
    public boolean onPlatform()
       {
        Platform a = (Platform) getOneObjectAtOffset(0,27,Platform.class);
        return a !=null;
       }
  
    public void checkGround(){
        if(onGround()||onGround2()||onStone()||onPlatform()){
            vSpeed=0;
        }else{
            fall();
        }
    }
     public void fall(){
        setLocation(getX(),getY()+vSpeed);
        vSpeed=vSpeed+acceleration;
        if(vSpeed>10){
            vSpeed=10;
        }
    }
}