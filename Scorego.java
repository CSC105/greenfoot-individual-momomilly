import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//import greenfoot.Font;
//import greenfoot.Color;
/**
 * Write a description of class Scorego here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scorego extends Actor
{
    /**
     * Act - do whatever the Scorego wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //int score = 0;
    public Scorego() 
    {
        setImage(new GreenfootImage("Score : " + Score.score, 24, Color.BLACK, Color.WHITE));
    } 
}    

