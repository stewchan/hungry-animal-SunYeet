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
    Bee deadleebee = new Bee();
    Flower flower = new Flower();
    public static boolean worldPause = false;
    private GreenfootImage[] skyField;
    private SimpleTimer animTimer;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        
        Wasp en1 = new Wasp(1);
        Wasp en2 = new Wasp(2);
        addObject(scoreLabel, 50, 50);
        addObject(deadleebee, 300, 200);
        //addObject(en1, Greenfoot.getRandomNumber(250), Greenfoot.getRandomNumber(400));
        //addObject(en2, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(150));
        spawnFlower();
        skyField = new GreenfootImage[21];
        for(int i = 0; i < skyField.length; i++)
        {
            skyField[i] = new GreenfootImage("images/sky-and-field-background/sky-and-field-background-" + i + ".png");
            skyField[i].scale(skyField[i].getWidth() - 100, skyField[i].getHeight() - 100);
            
        }
        setBackground(skyField[3]);
        animTimer = new SimpleTimer();
        animTimer.mark();

        //int waspX = 400;
        //int waspY = 100;
        
        worldPause = false;
    }
    public void act()
    {
        
        
        //GreenfootImage myImage = new GreenfootImage("bathroom-tile.jpg");
        /*
        if(deadleebee.getGameOver() == true)
        {
            setBackground(myImage);
            /*
            Greenfoot.setWorld(new GameOver());
            */
            //worldPause = true;
            //Label gameOver = new Label("Game Over!", 100);
          //  addObject(gameOver, 300, 200);
        //}
        if(deadleebee.getTouchingFlower() == true)
        {
            removeObject(flower);
            spawnFlower();
            increaseScore();
            
        }
        animate();
    }
    int curIndex = 0;
    public void animate()
    {
        if(animTimer.millisElapsed() > 100)
        {
            setBackground(skyField[curIndex]);
            curIndex++;
            curIndex %= 21;
            animTimer.mark();
        }
    }
    public void spawnFlower()
    {
        addObject(flower, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
    }
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
}
