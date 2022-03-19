import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{

    /**
     * Constructor for objects of class Level2.
     * 
     */
    public Level2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
  
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
     
        platform platform = new platform(20, 100);   
       addObject(platform,339,87);
        platform.setLocation(368,45);
        wombat wombat = new wombat();
        addObject(wombat,321,32);
        platform platform2 = new platform(20, 100);
        addObject(platform2,242,45);
        platform2.setLocation(255,45);
        platform2.setLocation(253,29);
        platform platform3 = new platform(100, 20);
        addObject(platform3,397,116);
        platform3.setLocation(396,105);
        platform platform4 = new platform(100, 20);
        addObject(platform4,210,114);
        platform4.setLocation(216,103);
        platform4.setLocation(234,106);
        platform4.setLocation(236,106);
        platform4.setLocation(228,81);
        platform.setLocation(367,45);
        platform.setLocation(370,62);
        platform3.setLocation(391,82);
        platform.setLocation(387,21);
        clover clover = new clover();
        addObject(clover,420,37);
        clover.setLocation(426,39);
        clover clover2 = new clover();
        addObject(clover2,201,32);

        platform platform5 = new platform(150, 20);
        addObject(platform5,444,189);
        platform5.setLocation(530,136);
        platform5.setLocation(524,156);
        platform platform6 = new platform(20, 200);
        addObject(platform6,467,254);
        platform6.setLocation(463,237);
        clover clover3 = new clover();
        addObject(clover3,537,263);
        platform platform7 = new platform(10, 200);
        addObject(platform7,254,181);
        platform7.setLocation(272,190);
        platform platform8 = new platform(150, 20);
        addObject(platform8,184,336);
        platform8.setLocation(224,297);
        platform8.setLocation(216,292);
        platform8.setLocation(235,290);
        platform platform9 = new platform(20, 150);
        addObject(platform9,393,226);
        platform9.setLocation(386,158);
        platform9.setLocation(371,192);
        platform9.setLocation(374,180);
        removeObject(platform9);

        addObject(platform9,383,175);
        platform9.setLocation(399,156);
        removeObject(platform9);

        addObject(platform9,424,156);
        platform9.setLocation(424,156);
        removeObject(platform9);

        platform platform10 = new platform(20, 150);
        addObject(platform10,370,195);
        platform10.setLocation(385,219);
        platform10.setLocation(376,245);
        platform10.setLocation(369,273);
        clover clover4 = new clover();
        addObject(clover4,308,247);
        platform10.setLocation(370,216);
        platform10.setLocation(373,250);
        platform platform11 = new platform(20, 200);
        addObject(platform11,155,252);
        platform11.setLocation(144,232);
        clover clover5 = new clover();
        addObject(clover5,204,226);
        platform platform12 = new platform(20, 200);
        addObject(platform12,78,266);
        platform12.setLocation(50,226);
    }
public void act(){
 if(getObjects(clover.class).isEmpty())
 Greenfoot.setWorld(new Level3());
    
}
}
