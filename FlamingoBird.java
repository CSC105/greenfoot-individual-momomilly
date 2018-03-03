import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlamingoBird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlamingoBird extends Actor
{
    private int img;
    private int direction;
    private int ySpeed;
    GreenfootImage[] rightImage = new GreenfootImage[36];
    GreenfootImage[] leftImage = new GreenfootImage[36];
    GreenfootImage[] images = new GreenfootImage[36];
    int imageNumber;
    public FlamingoBird() 
    {
        GreenfootImage myImage = getImage();

        for(int i=0 ; i<images.length ; i++){
            rightImage[i] = new GreenfootImage("Flamingo/go"+(i+1)+".png");
            leftImage[i] = new GreenfootImage("Flamingo/go"+(i+1)+".png");
            leftImage[i].scale(120,170);
            rightImage[i].scale(120,170);
            leftImage[i].mirrorHorizontally();
            setImage(images[imageNumber]);
        }
        setImage(rightImage[0]);

    }
    private int Speed = 6;
    private double dy = 0;
    private double g = 2;
    public void act() 
    {
        run();
        jump();
        checkTouch();

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

    public void jump ()
    {
        
        int groundLevel = 482;
        boolean onGround = (getY() == groundLevel);
        int count =2 ;
        if(!onGround)
        {
            ySpeed++;
            setLocation(getX(), getY() + ySpeed);
            if(getY() >= groundLevel)
            {
                setLocation(getX() , groundLevel);
                Greenfoot.getKey();
            }

        }else 
        {
            if(onGround)count = 2;

            if("space".equals(Greenfoot.getKey())){
                count --;
                ySpeed = -29;
                setLocation(getX(), getY() + ySpeed);
            }

        }

    }
    
    public void checkTouch()
    {
        if(isTouching(Stone.class) || isTouching(Flower.class)) 
        {
            goToRetry();
            
        }
        
        
    
    }
    
    public void goToRetry ()
    {
        Greenfoot.playSound("sounds/Splat Sound Effect.wav");
        
        Greenfoot.delay(10);
        
        
        getWorld().removeObject(this); 
    }
    
    
}


