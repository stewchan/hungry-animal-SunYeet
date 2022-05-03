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
    public void act()
    {
        fly();
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
