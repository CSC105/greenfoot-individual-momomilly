import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stone here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stone extends Actor
{
    /**
     * Act - do whatever the Stone wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage image = new GreenfootImage("images/Stone.png");
    public int speed = 2;
    public Stone() 
    {
        image.scale(80,80);
        setImage(image); 
        
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
