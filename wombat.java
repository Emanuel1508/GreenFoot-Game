import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class wombat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wombat extends Actor
{
    
    
    public void act() 
    {
      movement();
      eating();
      atWorldEdge();
      canMoveLeft();
      canMoveRight();
      canMoveDown();
      canMoveUp();
     
      
    }    
        public void movement() {
            int rotation = getRotation();
            int x = getX();
            int y = getY();
            if(Greenfoot.isKeyDown("up") && canMoveUp()) {
                y-=3;
                rotation = 260;
        }
        if(Greenfoot.isKeyDown("down") && canMoveDown()){
         y+=3;
         rotation = 100;
        }
     if(Greenfoot.isKeyDown("left") && canMoveLeft()){
         x-=3;
     rotation = 130;
    }

     if(Greenfoot.isKeyDown("right") && canMoveRight()) {
         x+=3;
         rotation = 359 ;
        }
     setLocation(x,y);
     setRotation(rotation);

    }
    public void eating(){
        Actor clover;
        clover = getOneObjectAtOffset ( 0, 0, clover.class);
    if(clover != null){
    getWorld().removeObject(clover);
    }
    }
    public void atWorldEdge(){
        if((getX() < - getWorld().getWidth() ) || (getX() > getWorld().getWidth()-20))
        setLocation(getX() - 6 , getY());
     if((getY() < 2 ) || (getY() > getWorld().getHeight() - 20))
     setLocation(getX(), getY() - 4);
    }
    public boolean canMoveLeft(){
        boolean canMoveLeft = true;
        int imageWidth = getImage().getWidth();
        int imageHeight = getImage().getHeight();

        if(getOneObjectAtOffset ( imageWidth / -2 - 3 , imageHeight / -2 , platform.class) !=null ||
      getOneObjectAtOffset ( imageWidth / -2 - 3, imageHeight / 2 , platform.class ) !=null)
    canMoveLeft = false;
    return canMoveLeft ;
    }
    public boolean canMoveRight(){
        boolean canMoveRight = true;
        int imageWidth = getImage().getWidth();
        int imageHeight = getImage().getHeight();
        if(getOneObjectAtOffset ( (imageWidth / 2) + 3 , imageHeight / -2 , platform.class) !=null ||
      getOneObjectAtOffset ( (imageWidth / 2) + 3, imageHeight / 2 , platform.class ) !=null)
    canMoveRight = false;

    return canMoveRight ;
    }
    public boolean canMoveDown(){
        boolean canMoveDown = true;
       int imageWidth = getImage().getWidth();
       int imageHeight = getImage().getHeight();
    if(getOneObjectAtOffset ( imageWidth / -2  , imageHeight / 2 , platform.class) != null ||
      getOneObjectAtOffset ( imageWidth / 2  , imageHeight / 2, platform.class) != null)
      canMoveDown = false;
      return canMoveDown ;
    }
    public boolean canMoveUp(){
        boolean canMoveUp = true;
       int imageWidth = getImage().getWidth();
    int imageHeight = getImage().getHeight();
    if(getOneObjectAtOffset ( imageWidth / -2  , imageHeight / -2 , platform.class) != null ||
      getOneObjectAtOffset ( imageWidth / 2  , imageHeight / -2, platform.class) != null)
      canMoveUp = false;
      return canMoveUp ;
    }

    }



