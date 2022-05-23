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
    private static boolean gameOver = false;
    private boolean touchingFlower = false;
    static public int flowersTouched = 0;
    private GreenfootImage[] rightBee;
    private GreenfootImage[] leftBee;
    private SimpleTimer animTimer;
    private boolean isFacingRight;
    public Bee()
    {
        rightBee = new GreenfootImage[15];
        leftBee = new GreenfootImage[15];
        for(int i = 0; i < rightBee.length; i++)
        {
            rightBee[i] = new GreenfootImage("images/bee/bee-" + i + ".png");
            rightBee[i].scale(rightBee[i].getWidth() - 300, rightBee[i].getHeight() - 300);
            leftBee[i] = new GreenfootImage("images/bee/bee-" + i + ".png");
            leftBee[i].mirrorHorizontally();
            leftBee[i].scale(leftBee[i].getWidth() - 300, leftBee[i].getHeight() - 300);
        }
        setImage(rightBee[3]);
        animTimer = new SimpleTimer();
        animTimer.mark();
    }
    public void act()
    {
        touchingFlower = false;
        
        if(gameOver == false)
        {
            fly();
            animate();
        }
        
        if(isTouching(Wasp.class))
        {
            //gameOver = true;
            Greenfoot.setWorld(new GameOver());
            
        }
        
        if(isTouching(Flower.class))
        {
            touchingFlower = true;
            flowersTouched += 1;
        }
        
    }
    int curIndex = 0;
    public void animate()
    {
        if(animTimer.millisElapsed() > 100)
        {
            if(isFacingRight)
            {
                setImage(rightBee[curIndex]);
            } 
            else
            {
                setImage(leftBee[curIndex]);
            }
            curIndex++;
            curIndex %= 15;
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
            isFacingRight = false;
            x -= 10;
        }

        if(Greenfoot.isKeyDown("D")) 
        {
            isFacingRight = true;
            x += 10;
        }
        
        setLocation (x, getY());
        
 
    }
    

 
    
    //public double get
    
}
