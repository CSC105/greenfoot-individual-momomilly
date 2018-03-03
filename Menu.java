import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    GreenfootImage in1 = new GreenfootImage("images/bgmenu.png");
    //GreenfootImage[] images = new GreenfootImage[36];
    int time = 0;
    int k = 1;
    
    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
       super(1280,640,1); 
       addObject(new Entergame(),633,516);
       //addObject(new Flamingoo (),649,212); 
       addObject(new logo (),650,200);
       
       Flamingoo flamingoo = new Flamingoo();
       addObject(flamingoo,627,356);
       
       vSound ();
    }
    
    public void vSound ()
    {
        Greenfoot.playSound("sounds/Ramune.mp3");
            
        
        
        
        
    }
    
    
}
