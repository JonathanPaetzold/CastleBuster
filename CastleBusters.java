import greenfoot.*; 
public class CastleBusters extends World
   {
    private int level;
    public CastleBusters()
       {   
        super(700,300,1);
        
        levelOne();
       }
    public void levelOne()
       {
        level=1;
        removeObjects(getObjects(Actor.class));
        setBackground("Castle1.png");
        addObject(new Ground(),350,280);
        addObject(new Figure(),45,238);
       
     
        addObject(new Stone(),376,243);
        addObject(new Stone(),410,215);
        addObject(new Archer(145,5,-25,55),410,180);
        addObject(new Archer(145,5,0,55),376,205);
        addObject(new Stone(),410,243);
        addObject(new Stone(),700,245);
        addObject(new Stone(),665,245);
        addObject(new Stone(),630,245);
        addObject(new Stone(),595,245);
        addObject(new Stone(),700,210);
        addObject(new Stone(),700,185);
        addObject(new Stone(),700,155);
        addObject(new Stone(),665,210);
        addObject(new Stone(),665,185);
        addObject(new Stone(),630,210);
        addObject(new Archer(300,5,-18, 75),685,125);
        
        addObject(new Level1(),120,55);
        addObject(new LevelEnd(),690,210);
       }
    public void levelTwo()
       {
        level=2;
        removeObjects(getObjects(Actor.class));
       
        setBackground("Castle1.png");
        addObject(new Ground(),350,280);
        addObject(new Figure(),45,238);
        
        addObject(new Stone(),700,245);
        addObject(new Stone(),665,245);
        addObject(new Stone(),630,245);
        addObject(new Stone(),595,245);
        addObject(new Stone(),700,210);
        addObject(new Stone(),700,185);
        addObject(new Stone(),700,155);
        addObject(new Stone(),665,210);
        addObject(new Stone(),665,185);
        addObject(new Stone(),630,210);
        addObject(new Stone(),630,185);
        addObject(new Stone(),630,155);
        addObject(new Stone(),665,155);
        addObject(new Stone(),420,210);
        addObject(new Stone(),420,185);
        addObject(new Stone(),420,245);
        addObject(new Stone(),385,210);
        addObject(new Stone(),455,210);
        
        addObject(new Archer(250,5,-35,65),500,80);
        addObject(new Archer(400,7,0,65),600,215);
        addObject(new Archer(75,5,-15,65),420, 150);
        addObject(new Platform(),500,100);
        
       
        
        addObject(new Level2(),120,55);
        addObject(new LevelEnd(),690,155);
       }
    public void levelThree()
       {
        level=3;
        removeObjects(getObjects(Actor.class));
        setBackground("Castle1.png");
        addObject(new Ground2(),350,280);
        addObject(new Figure(),45,238);
        
       addObject(new Stone(),700,245);
       addObject(new Stone(),665,245);
       addObject(new Stone(),630,245);
       addObject(new Stone(),595,245);
       addObject(new Stone(),700,210);
       addObject(new Stone(),700,185);
       addObject(new Stone(),700,155);
       addObject(new Stone(),665,210);
       addObject(new Stone(),665,185);
       addObject(new Stone(),630,210);
       addObject(new Stone(),630,185);
       addObject(new Stone(),630,155);
       addObject(new Stone(),665,155);
       addObject(new Stone(),340, 245);
       addObject(new Stone(),340, 210);
       addObject(new Stone(),340, 185);
       addObject(new Stone(),340, 155);
       addObject(new Stone(),340, 120);
       addObject(new Stone(),340, 85);
       addObject(new Stone(),340, 50);
       addObject(new Stone(),340, 25);
       addObject(new Stone(),375, 245);
       addObject(new Stone(),375, 210);
       addObject(new Stone(),375, 185);
       addObject(new Stone(),375, 155);
       addObject(new Stone(),375, 120);
       addObject(new Stone(),375, 85);
       addObject(new Stone(),375, 50);
       addObject(new Stone(),375, 25);
       addObject(new Stone(),410, 245);
       addObject(new Stone(),410, 210);
       addObject(new Stone(),410, 185);
       addObject(new Stone(),410, 155);
       addObject(new Stone(),410, 120);
       addObject(new Stone(),410, 85);
       addObject(new Stone(),410, 50);
       addObject(new Stone(),410, 25);
       addObject(new Platform(),35,60);
       addObject(new Platform(),635,60);
       addObject(new Archer(400,5,-40,72),635,40);
       addObject(new RightArcher(300,6,40,65),35,40);
       addObject(new Archer(220,5,0,72),600,210);
       addObject(new Archer(240,8,0,65),565,245);
        
       addObject(new Level3(),120,55);
       addObject(new LevelEnd(),690,210);
       }
   public void levelEnd()
       {
        level=4;
        removeObjects(getObjects(Actor.class));
        setBackground("Wall.jpg");
        
       
       } 
  
    public void addLevel()
       {
        level++;
      
        if(level==1)
           {
           levelOne();
           }
        if(level==2)
           {
           levelTwo();
           }
        if(level==3)
           {
           levelThree();
           }
        if(level==4)
           {
           levelEnd();
           }
        
       }
    public void addBulletright(int figurex, int figurey)
       {
        addObject(new Bulletright(),figurex,figurey);
       }
    public void addBulletleft(int figurex, int figurey)
       {
        addObject(new Bulletleft(),figurex,figurey);
       }
    public void addArrowLeft()
       {
        addObject(new Arrowleft(370,80,7,0,200),370,200);
       }
    public void deleteBullet(Actor actor)
       {
        removeObject(actor);
        return;
       }
    public void deleteEnemy(Actor actor)
       {
        removeObject(actor);
        return;
       }
    
}