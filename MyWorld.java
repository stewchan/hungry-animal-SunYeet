import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public int level = 1;
    Bee deadleebee = new Bee(10);
    public static boolean worldPause = false;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        Wasp en = new Wasp(10);
        addObject(deadleebee, 300, 200);
        addObject(en, 400, 100);

        //int waspX = 400;
        //int waspY = 100;
        
        worldPause = false;
    }
    public void act()
    {
        
        GreenfootImage myImage = new GreenfootImage("bathroom-tile.jpg");
        if(deadleebee.getGameOver() == true)
        {
            setBackground(myImage);
            /*
            Greenfoot.setWorld(new GameOver());
            */
            worldPause = true;
        }
    }
   
    
    
}
