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
    
    public int speed = 2;
    public Flower ()
    {
        getImage().scale(150,150);
    }
    
    public void act() 
    {
        Move();
        
          
        
       
    }  
    
    public void Move()
    {
        setLocation(getX()- (int)MyWorld.scrollSpeed ,getY());
        
        if(getX()==0){
            getWorld().removeObject(this);
        }

        
    }
    
    
}
