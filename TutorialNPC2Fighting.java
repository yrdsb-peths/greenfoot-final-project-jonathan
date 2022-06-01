import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Second tutorial NPC fighting
 * 
 * @author Jonathan Zhao
 * @version June 1
 */
public class TutorialNPC2Fighting extends Actor
{
    SimpleTimer animationTimer = new SimpleTimer();
    GreenfootImage[] fighting = new GreenfootImage[10];
    
    // HP
    public static int tutorialHP = 100;
    
    
    // Animation
    public TutorialNPC2Fighting()
    {
        for(int i = 0; i < 10; i++)
        {
            fighting[i] = new GreenfootImage("images/NPCs/FriendNPC2Fight/NPCFight00" + i + ".png");
        }
        setImage(fighting[0]);
        
        animationTimer.mark();
    }
    
    int imageIndex = 0;
    public void animateNPCFight()
    {
        if(animationTimer.millisElapsed() < 90)
        {
            return;
        }
        animationTimer.mark();
        
        setImage(fighting[imageIndex]);
        imageIndex = (imageIndex + 1) % fighting.length;    
        
    }

    
    public void act()
    {
        animateNPCFight();
        if(tutorialHP <= 0)
        {
            Wallet.wallet += 10;
            Greenfoot.setWorld(new World2Ver2());
        }
    }
    
}
