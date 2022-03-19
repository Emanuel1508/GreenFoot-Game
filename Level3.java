import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends World
{

    /**
     * Constructor for objects of class Level3.
     * 
     */
    public Level3()
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

        platform platform = new platform(200, 20);
        addObject(platform,509,179);
        platform.setLocation(503,185);
        platform platform2 = new platform(200, 20);
        addObject(platform2,142,183);
        platform2.setLocation(106,182);
        wombat wombat = new wombat();
        addObject(wombat,305,43);
        platform platform3 = new platform(20, 100);
        addObject(platform3,408,19);
        platform3.setLocation(409,53);
        clover clover = new clover();
        addObject(clover,575,21);
        platform platform4 = new platform(100, 20);
        addObject(platform4,519,52);
        platform4.setLocation(471,88);
        platform platform5 = new platform(80, 20);
        addObject(platform5,472,243);
        platform5.setLocation(560,245);
        platform5.setLocation(573,238);
        platform5.setLocation(573,254);
        clover clover2 = new clover();
        addObject(clover2,568,219);
        platform platform6 = new platform(20, 200);
        addObject(platform6,358,245);
        platform6.setLocation(395,250);
        platform6.setLocation(338,250);
        platform5.setLocation(558,277);
        platform platform7 = new platform(20, 200);
        addObject(platform7,192,112);
        platform7.setLocation(220,160);
        wombat.setLocation(312,106);
        clover clover3 = new clover();
        addObject(clover3,19,150);
        platform platform8 = new platform(200, 20);
        addObject(platform8,107,275);
        platform8.setLocation(151,267);
        clover clover4 = new clover();
        addObject(clover4,173,228);
        platform platform9 = new platform(200, 20);
        addObject(platform9,173,347);
        platform9.setLocation(150,349);
        clover clover5 = new clover();
        addObject(clover5,14,380);
    }
    public void act(){

        if(getObjects(clover.class).isEmpty())
            Greenfoot.setWorld(new Finish());
}
}
