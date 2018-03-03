import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Font;
import greenfoot.Color;
/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     
   public static int score = 0;
    public void act() 
    {
        setImage(new GreenfootImage("Score : " + score, 24, Color.BLACK, Color.WHITE));
    } 
    
    public void addScore(int x)
    {
        score = score+x;
    }
    
    public void setScore(int score)
    {
        this.score = score;
    }
    
    public Score(){
        score = score;
        
    }

    
}

