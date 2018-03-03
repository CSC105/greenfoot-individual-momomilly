import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Flamingoo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flamingoo extends Actor
{
    GreenfootImage[] images = new GreenfootImage[36];
    GreenfootImage[] rightImage = new GreenfootImage[36];
    
    public void act() 
    {
        run();
        
    }
    public Flamingoo() 
    {
        GreenfootImage myImage = getImage();
        for(int i=0 ; i<images.length ; i++)
        {
            rightImage[i] = new GreenfootImage("Flamingo/go"+(i+1)+".png");
            rightImage[i].scale(120,170);
           
         
        } 
    }
    
    int i = 0;
    public void run()
    {
        i++;
        setImage(rightImage[i]);
        if(i == 35 ) 
        {
            i = 0;    
        }
       }
    }    


