import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Main Character's animations and movements in the normal world
 * 
 * @author Jonathan Zhao
 * @version 2
 */
public class MainCharacter extends Actor
{
    SimpleTimer animationTimer = new SimpleTimer();
    GreenfootImage[] idle = new GreenfootImage[7];
    
    /**
     * Character Animations
     */
    public MainCharacter()
    {
        for(int i = 0; i < 7; i++)
        {
            idle[i] = new GreenfootImage("images/WalkCycle/Walk00" + i + ".png");
            idle[i].scale(50,70);
        }
    }
    
    int imageIndex = 0;
    public void animateWalkMainCharacter()
    {
        if(animationTimer.millisElapsed() < 90)
        {
            return;
        }
        animationTimer.mark();
        
        setImage(idle[imageIndex]);
        imageIndex = (imageIndex + 1) % idle.length;
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("a"))
        {
            setRotation(180);
            move(3);
            animateWalkMainCharacter();
        }
        else if(Greenfoot.isKeyDown("d"))
        {
            setRotation(0);
            move(3);
            animateWalkMainCharacter();
        }

        else if(Greenfoot.isKeyDown("w"))
        {
            setRotation(270);
            move(3);
            animateWalkMainCharacter();
        }
        else if(Greenfoot.isKeyDown("s"))
        {
            setRotation(90);
            move(3);
            animateWalkMainCharacter();
        }
        else
        {
            setImage("images/WalkCycle/MainIdle.png");
            
        }
    }
}
