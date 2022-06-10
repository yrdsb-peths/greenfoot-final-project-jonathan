import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The main character in a fight
 * 
 * @author Jonathan Zhao
 * @version June 1
 */
public class MainCharacterFighting extends Actor
{
    // HP
    public static int mainCharacterHP = 100;
    public static void resetStatic()
    {
        mainCharacterHP = 100;
    }
    
    SimpleTimer animationTimer = new SimpleTimer();
    GreenfootImage[] fighting = new GreenfootImage[3];
    
    public void act()
    {
        animatePunch();
        if(mainCharacterHP <= 0)
        {
            Greenfoot.setWorld(new YouDied());
        }
    }

    public void animatePunch()
    {
        if(FightButton.punch || FightButtonTutorial.punchTutorial)
        {
            setImage("MainFacing001.png");  
        }
        else
        {
            setImage("MainFacing000.png");
        }
    }
}
