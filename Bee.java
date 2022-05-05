import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class deadleebee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
static public int flowersTouched = 0;
public class Bee extends Actor
{
    /**
     * Act - do whatever the deadleebee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean gameOver = false;
    private boolean touchingFlower = false;
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
        int y = getY();
        
  
        if(Greenfoot.isKeyDown("W")) 
        {
            setRotation(270);
            y -= 5;
        }
        if(Greenfoot.isKeyDown("S")) 
        {
            setRotation(270);
            y += 5;
        }
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
        
        setLocation (x, y);
        
 
    }
    
    public void gameOver()
    {
        
    }
    
    private static int numBees;
    private int size;
    private int speed;
    
    public Bee(int speed)
    {
        this.size = size;
        this.size = speed;
        numBees += 1;
    }
    
    public int getSpeed()
    {
        return speed;
    }
    
    //public double get
    
}
