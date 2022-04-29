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
        move(10);
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
    
    public void fly()
    {
        move(this.speed);
    }
}
