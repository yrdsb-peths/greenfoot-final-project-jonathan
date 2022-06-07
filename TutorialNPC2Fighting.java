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
    GreenfootImage[] gettingHit = new GreenfootImage[3];
    GreenfootImage[] attack = new GreenfootImage[2];
    
    // HP
    public static int tutorialHP = 100;
    
    // Reset HP
    public static void resetStatic()
    {
        tutorialHP = 100;
    }
    
    // Animation
    public TutorialNPC2Fighting()
    {
        // Animation for getting hit
        for(int i = 0; i < 3; i++)
        {
            gettingHit[i] = new GreenfootImage("images/NPCs/FriendNPC2Fight/NPCDamage00" + i + ".png");
        }
        setImage(gettingHit[0]);
        
        // Animation for attacking
        for(int i = 0; i < 2; i++)
        {
            attack[i] = new GreenfootImage("images/NPCs/FriendNPC2Fight/NPCAttack00" + i + ".png");
        }
        setImage(attack[0]);
        
        // Animation for idle
        for(int i = 0; i < 10; i++)
        {
            fighting[i] = new GreenfootImage("images/NPCs/FriendNPC2Fight/NPCFight00" + i + ".png");
        }
        setImage(fighting[0]);
        
        animationTimer.mark();
    }
    
    int imageIndex = 0;
    int imageIndex2 = 0;
    int imageIndex3 = 0;
    public void animateNPCFight()
    {
        if(FightButtonTutorial.punchTutorial || UsePotionYesButton.usedPotion)
        {
            setImage("images/NPCs/FriendNPC2Fight/NPCDamage000.png");
            if(animationTimer.millisElapsed() < 270)
            {
                return;
            }
            animationTimer.mark();
            
            setImage(gettingHit[imageIndex2]);
            imageIndex2 = (imageIndex2 + 1) % gettingHit.length; 
            FightButtonTutorial.punchTutorial = false;
            UsePotionYesButton.usedPotion = false;
            FightButtonTutorial.enemyTurnTutorial = true;
            FightButtonTutorial.enemyTurnAnimationsTutorial = true;
        }
        else if(FightButtonTutorial.enemyTurnAnimationsTutorial)
        {
            setImage("images/NPCs/FriendNPC2Fight/NPCAttack000.png");
            if(animationTimer.millisElapsed() < 270)
            {
                return;
            }
            setImage("images/NPCs/FriendNPC2Fight/NPCAttack001.png");
            if(animationTimer.millisElapsed() < 540)
            {
                return;
            }
            animationTimer.mark();
            
            setImage(attack[imageIndex3]);
            imageIndex3 = (imageIndex3 + 1) % attack.length;
            
            FightButtonTutorial.enemyTurnAnimationsTutorial = false;
        }   
        
        else
        {
            if(animationTimer.millisElapsed() < 90)
            {
                return;
            }
            animationTimer.mark();
            
            setImage(fighting[imageIndex]);
            imageIndex = (imageIndex + 1) % fighting.length; 
        }
        
        
    }

    
    public void act()
    {
        animateNPCFight();
        if(FightButtonTutorial.enemyTurnTutorial)
        {
            MainCharacterFighting.mainCharacterHP -= Greenfoot.getRandomNumber(10);
            FightButtonTutorial.enemyTurnTutorial = false;
        }
        if(tutorialHP <= 0)
        {
            Wallet.wallet += 10;
            Greenfoot.setWorld(new World2Ver2());
            FightButtonTutorial.punchTutorial = false;
        }
    }
    
}
