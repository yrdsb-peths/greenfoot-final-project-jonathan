import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The main enemies of the game
 * 
 * @author Jonathan Zhao 
 * @version June 6
 */
public class TheRedsFighting extends Actor
{
    SimpleTimer animationTimer = new SimpleTimer();
    GreenfootImage[] fighting = new GreenfootImage[12];
    GreenfootImage[] gettingHit = new GreenfootImage[2];
    GreenfootImage[] attack = new GreenfootImage[2];
    
    
    public static boolean theReds = false; // If fighting the reds, is true
    public static int redHP = 100;
    // Reset statics
    public static void resetStatic()
    {
        redHP = 100;
        theReds = false;
    }
    
    public TheRedsFighting()
    {
        // Animation for getting hit
        for(int i = 0; i < 2; i++)
        {
            gettingHit[i] = new GreenfootImage("images/NPCs/TheRedsFight/RedDamage00" + i + ".png");
        }
        setImage(gettingHit[0]);
        
        // Animation for attacking
        for(int i = 0; i < 2; i++)
        {
            attack[i] = new GreenfootImage("images/NPCs/TheRedsFight/RedAttack00" + i + ".png");
        }
        setImage(attack[0]);
        
        // Animation for idle
        for(int i = 0; i < 12; i++)
        {
            fighting[i] = new GreenfootImage("images/NPCs/TheRedsFight/RedFight00" + i + ".png");
        }
        setImage(fighting[0]);
        
        animationTimer.mark();
    }
    
    
    int imageIndex = 0;
    int imageIndex2 = 0;
    int imageIndex3 = 0;
    public void animateFight()
    {
        if(FightButton.punch || UsePotionYesButton.usedPotion)
        {
            setImage("images/NPCs/TheRedsFight/RedDamage000.png");
            if(animationTimer.millisElapsed() < 270)
            {
                return;
            }
            setImage("images/NPCs/TheRedsFight/RedDamage001.png");
            if(animationTimer.millisElapsed() < 570)
            {
                return;
            }
            animationTimer.mark();
            
            setImage(gettingHit[imageIndex2]);
            imageIndex2 = (imageIndex2 + 1) % gettingHit.length; 
            FightButton.punch = false;
            UsePotionYesButton.usedPotion = false;
            FightButton.enemyTurn = true;
            FightButton.enemyTurnAnimations = true;
        }
        else if(FightButton.enemyTurnAnimations)
        {
            setImage("images/NPCs/TheRedsFight/RedAttack000.png");
            if(animationTimer.millisElapsed() < 270)
            {
                return;
            }
            setImage("images/NPCs/TheRedsFight/RedAttack001.png");
            if(animationTimer.millisElapsed() < 570)
            {
                return;
            }
            animationTimer.mark();
            
            setImage(attack[imageIndex3]);
            imageIndex3 = (imageIndex3 + 1) % attack.length;
            
            FightButton.enemyTurnAnimations = false;
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
        animateFight();
        if(FightButton.enemyTurn)
        {
            FightButton.enemyTurn = false;
            MainCharacterFighting.mainCharacterHP -= Greenfoot.getRandomNumber(15);
        }
        if(redHP <= 0)
        {
            Wallet.lootMoney();
            Greenfoot.setWorld(new Stronghold(getWorld()));
            resetStatic();
            FightButton.punch = false;
            MainCharacter.canMove = true;
            TheReds.canMove = true;
            FightButton.enemyTurnAnimations = false;
            theReds = false;
        }
    }
}

