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
    public int score = 0;
    public Label scoreLabel = new Label(0, 50);
    public Label levelLabel = new Label(0, 50);
    Bee deadleebee = new Bee();
    Flower flower = new Flower();
    public static boolean worldPause = false;
    public static int level = 1;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        addObject(scoreLabel, 50, 50);
        addObject(levelLabel, 550, 50);
        addObject(deadleebee, 300, 200);
        spawnFlower();
        
        level = 1;

        //int waspX = 400;
        //int waspY = 100;
        
        worldPause = false;
    }
    public void act()
    {
        
        GreenfootImage myImage = new GreenfootImage("bathroom-tile.jpg");
        int scoreToLevelUp = 0;
        
        if(deadleebee.getGameOver() == true)
        {
            setBackground(myImage);
            /*
            Greenfoot.setWorld(new GameOver());
            */
            worldPause = true;
            Label gameOver = new Label("Game Over!", 100);
            addObject(gameOver, 300, 200);
        }

        if(deadleebee.getTouchingFlower() == true)
        {
            removeObject(flower);
            spawnFlower();
            increaseScore();
            scoreToLevelUp ++;
        }
        
        if(scoreToLevelUp == 2)
        {
            levelUp();
            scoreToLevelUp = 0;
        }
        
        
        
    }
    public void spawnFlower()
    {
        addObject(flower, Greenfoot.getRandomNumber(600), 0);
    }
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
    public void levelUp()
    {
            
            level ++;
            levelLabel.setValue(level);
    }
    public int getLevel()
    {
        return level;
    }
}
