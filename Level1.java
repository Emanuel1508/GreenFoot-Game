import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Level1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
      
       
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare() {
        
        clover clover = new clover();
        addObject(clover,231,287);
        wombat wombat = new wombat();
        addObject(wombat,211,137);
        wombat.setLocation(107,288);
        clover clover2 = new clover();
        addObject(clover2,153,153);
        platform platform = new platform(50, 50);
        addObject(platform,338,251);
        removeObject(clover);
        removeObject(platform);
        removeObject(clover2);
        wombat.setLocation(100,182);
        wombat.setLocation(88,32);
        platform platform2 = new platform(20, 300);
        addObject(platform2,158,61);
        platform2.setLocation(144,152);
        platform platform3 = new platform(20, 300);
        addObject(platform3,57,88);
        platform3.setLocation(34,146);
        clover clover3 = new clover();
        addObject(clover3,18,364);
        clover3.setLocation(30,379);
        platform platform4 = new platform(100, 20);
        addObject(platform4,164,319);
        platform4.setLocation(186,305);
        platform platform5 = new platform(100, 20);
        addObject(platform5,148,377);
        platform5.setLocation(181,370);
        platform5.setLocation(191,394);
        platform platform6 = new platform(300, 100);
        addObject(platform6,318,305);
        removeObject(platform6);
        addObject(platform6,372,145);
        platform6.setLocation(241,219);
        clover clover4 = new clover();
        addObject(clover4,189,267);
        platform platform7 = new platform(100, 20);
        addObject(platform7,375,150);
        platform7.setLocation(273,105);
        platform platform8 = new platform(20, 100);
        addObject(platform8,342,154);
        platform8.setLocation(342,151);
        platform platform9 = new platform(20, 100);
        addObject(platform9,354,238);
        platform9.setLocation(335,242);
        platform platform10 = new platform(10, 10);
        addObject(platform10,345,301);
        platform10.setLocation(345,303);
        removeObject(platform10);
        addObject(platform10,342,305);
        platform10.setLocation(347,304);
        clover clover5 = new clover();
        addObject(clover5,292,144);
        addObject(platform6,228,181);
        platform platform11 = new platform(20, 200);
        addObject(platform11,217,159);
        platform11.setLocation(231,201);
        platform platform12 = new platform(20, 200);
        addObject(platform12,397,249);
        platform12.setLocation(333,171);
        platform12.setLocation(325,259);
        platform12.setLocation(340,237);
        platform12.setLocation(333,243);
        removeObject(platform6);
        removeObject(platform8);
        removeObject(platform10);
        removeObject(platform12);
        platform9.setLocation(330,211);
        removeObject(platform9);
        platform platform13 = new platform(20, 200);
        addObject(platform13,344,202);
        platform13.setLocation(333,192);
        platform platform14 = new platform(100, 20);
        addObject(platform14,432,104);
        platform14.setLocation(471,103);
        clover clover6 = new clover();
        addObject(clover6,577,24);
        platform platform15 = new platform(20, 200);
        addObject(platform15,430,159);
        platform15.setLocation(428,199);
        platform platform16 = new platform(100, 20);
        addObject(platform16,564,107);
        platform16.setLocation(569,102);
        platform13.setLocation(333,214);
        platform13.setLocation(337,170);
        platform13.setLocation(328,249);
        platform13.setLocation(334,162);
        platform13.setLocation(357,263);
        removeObject(platform13);
        addObject(platform13,356,217);
        removeObject(platform13);
        addObject(platform13,359,240);
        platform13.setLocation(330,186);
        platform platform17 = new platform(100, 20);
        addObject(platform17,486,299);
        platform17.setLocation(488,287);
        clover clover7 = new clover();
        addObject(clover7,487,158);
    }

    public void act(){
        if(getObjects(clover.class).isEmpty())
        Greenfoot.setWorld(new Level2());
    }
}

