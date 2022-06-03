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
        for(int i = 0; i < 3; i++)
        {
            gettingHit[i] = new GreenfootImage("images/NPCs/FriendNPC2Fight/NPCDamage00" + i + ".png");
        }
        setImage(gettingHit[0]);
        
        for(int i = 0; i < 2; i++)
        {
            attack[i] = new GreenfootImage("images/NPCs/FriendNPC2Fight/NPCAttack00" + i + ".png");
        }
        setImage(attack[0]);
        
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
        if(FightButtonTutorial.punch || UsePotionYesButton.usedPotion)
        {
            setImage("images/NPCs/FriendNPC2Fight/NPCDamage000.png");
            if(animationTimer.millisElapsed() < 270)
            {
                return;
            }
            animationTimer.mark();
            
            setImage(gettingHit[imageIndex2]);
            imageIndex2 = (imageIndex2 + 1) % gettingHit.length; 
            FightButtonTutorial.punch = false;
            UsePotionYesButton.usedPotion = false;
            FightButtonTutorial.enemyTurn = true;
            FightButtonTutorial.enemyTurnAnimations = true;
        }
        else if(FightButtonTutorial.enemyTurnAnimations)
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
            
            FightButtonTutorial.enemyTurnAnimations = false;
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
        if(FightButtonTutorial.enemyTurn)
        {
            MainCharacterFighting.mainCharacterHP -= Greenfoot.getRandomNumber(10);
            FightButtonTutorial.enemyTurn = false;
        }
        if(tutorialHP <= 0)
        {
            Wallet.wallet += 10;
            Greenfoot.setWorld(new World2Ver2());
        }
    }
    
}
