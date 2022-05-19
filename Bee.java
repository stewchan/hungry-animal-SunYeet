import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class deadleebee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Bee extends Actor
{
    /**
     * Act - do whatever the deadleebee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean gameOver = false;
    private boolean touchingFlower = false;
    static public int flowersTouched = 0;
    public void act()
    {
        touchingFlower = false;
        
        if(gameOver == false)
        {
            fly();
        }
        
        if(isTouching(Wasp.class))
        {
            gameOver = true;
            //Greenfoot.setWorld(new GameOver());
            
        }
        
        if(isTouching(Flower.class))
        {
            touchingFlower = true;
            flowersTouched += 1;
        }
    }
    public boolean getGameOver()
    {
        return gameOver;
    }
    public boolean getTouchingFlower()
    {
        return touchingFlower;
    }
    public void fly()
    {
        int x = getX();

        if(Greenfoot.isKeyDown("A")) 
        {
            setRotation(180);
            x -= 5;
        }

        if(Greenfoot.isKeyDown("D")) 
        {
            setRotation(0);
            x += 5;
        }
        
        setLocation (x, getY());
        
 
    }
    
    public void gameOver()
    {
        
    }
 
    
    //public double get
    
}
