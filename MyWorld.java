import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (Mild) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private static final String bgImageName = "background.png";
    public static final double scrollSpeed = 10;
    private static final int picWidth = (new GreenfootImage(bgImageName)).getWidth();
    public static int score = 0;
    Score scoreObj = null; 
    private int timeCounter = 0;
    private GreenfootImage bgImage, bgBase;
    private int scrollPosition = 0;
   
    
    
    public MyWorld()
    {    
        super(1280, 640, 1, false);
        setBackground(bgImageName);
        bgImage = new GreenfootImage(getBackground());
        bgBase = new GreenfootImage(picWidth, getHeight());
        bgBase.drawImage(bgImage, 0, 0);
        prepare();
        
        scoreObj = new Score();
        addObject(scoreObj,825,45);
        scoreObj.setScore(0);
        
        setPaintOrder(FlamingoBird.class);
    }
    
    
    public void Score()
    {
        
        if(timeCounter%5 == 0) 
        {
           score++;
           scoreObj.setScore(score);
           
        }
        timeCounter++;
    }
    
     int count = 0;
     public void act()
    {
        Score();
        
        scrollPosition -= scrollSpeed;
        while(scrollSpeed > 0 && scrollPosition < -picWidth) scrollPosition += picWidth;
        while(scrollSpeed < 0 && scrollPosition > 0) scrollPosition -= picWidth;
        paint(scrollPosition);
         
        
        
        count ++ ;
        if (count == 200 )
        {
        Stone stone  = new Stone();
        addObject(stone,getWidth(), 547);
        
        count = Greenfoot.getRandomNumber(30);
        }
        count ++ ;
        if (count == 200 )
        {
        Flower flower  = new Flower();
        addObject(flower,getWidth(), 515);
        
        count = Greenfoot.getRandomNumber(25);
        }
       
        checkDied();
        
        
    }
     
     private void paint(int position)
    {
        GreenfootImage bg = getBackground();
        bg.drawImage(bgBase, position, 0);
        bg.drawImage(bgImage, position + picWidth, 0);
    }
    

    private void prepare() // add flamingo
    {
        FlamingoBird flamingo = new FlamingoBird();
        addObject(flamingo,141,482);
    }
    
    public void checkDied()
    {
        if(getObjects(FlamingoBird.class).size() == 0)
        {
            Greenfoot.setWorld(new Gameover());
        }
    }
    
   
    
    
}
    



    
    