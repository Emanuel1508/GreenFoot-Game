import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class platform here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class platform extends Actor
{
    public platform(int width, int height){
        GreenfootImage image = getImage() ;
        image.scale(width, height);
        setImage(image);
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
