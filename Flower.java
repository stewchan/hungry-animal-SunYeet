import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Flower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flower extends Actor
{
    /**
     * Act - do whatever the Flower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        MyWorld world = new MyWorld();
        fall();// Add your action code here.
        if(getY() >= 399)
        {
            world.gameOver();
        }
    }    
    
    public Flower()
    {
        GreenfootImage flower = new GreenfootImage("images/flower.png");
        flower.scale(flower.getWidth() - 150, flower.getWidth() - 150);
        setImage(flower);
    }
    public void fall()
    {
        setLocation(getX(), getY() + 5);
    }
}
