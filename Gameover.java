import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gameover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gameover extends World
{
    GreenfootImage inn = new GreenfootImage("images/bggameover.png");
    //public int score = 0;
    
    
    /**
     * Constructor for objects of class Gameover.
     * 
     */
    public Gameover()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 640, 1);
        Prepare();
        checkPlayagain();
        addObject(new Score(),629,324);
        //goscoreObj.setScore(score);
        
    }
    
    public void Prepare()
    {
        Gameoverr gameoverr = new Gameoverr();
        addObject(gameoverr,662,110);
    }
    
    public void checkPlayagain()
    {
        Playagain playagain = new Playagain();
        addObject(playagain,635,407);
    }
    
    
}
