import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Big Red fighting
 * 
 * @author Jonathan Zhao 
 * @version June 15
 */
public class BigRedFighting extends Actor
{
    SimpleTimer animationTimer = new SimpleTimer();
    GreenfootImage[] fighting = new GreenfootImage[11];
    GreenfootImage[] gettingHit = new GreenfootImage[2];
    GreenfootImage[] attack = new GreenfootImage[2];
    
    public static int bigRedHP = 250;
    public static boolean bigRed = false; // Is true when fighting big red
    public static boolean bigRedBeated = false; //Is true after beating big red
    
    // Reset statics
    public static void resetStatic()
    {
        bigRedHP = 250;
        bigRed = false;
        bigRedBeated = false;
    }
    
    public BigRedFighting()
    {
        // Animation for getting hit
        for(int i = 0; i < 2; i++)
        {
            gettingHit[i] = new GreenfootImage("images/NPCs/BigRedFight/BigDamage00" + i + ".png");
        }
        setImage(gettingHit[0]);
        
        // Animation for attacking
        for(int i = 0; i < 2; i++)
        {
            attack[i] = new GreenfootImage("images/NPCs/BigRedFight/BigAttack00" + i + ".png");
        }
        setImage(attack[0]);
        
        // Animation for idle
        for(int i = 0; i < 11; i++)
        {
            fighting[i] = new GreenfootImage("images/NPCs/BigRedFight/BigFight00" + i + ".png");
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
            setImage("images/NPCs/BigRedFight/BigDamage000.png");
            if(animationTimer.millisElapsed() < 270)
            {
                return;
            }
            setImage("images/NPCs/BigRedFight/BigDamage001.png");
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
            setImage("images/NPCs/BigRedFight/BigAttack000.png");
            if(animationTimer.millisElapsed() < 270)
            {
                return;
            }
            setImage("images/NPCs/BigRedFight/BigAttack001.png");
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
    
    public int getRandomNumber(int start, int end) // Gets random number between two numbers
    {
        int normal = Greenfoot.getRandomNumber(end-start+1);
        return normal + start;
    }
    public void act()
    {
        animateFight();
        if(FightButton.enemyTurn)
        {
            FightButton.enemyTurn = false;
            MainCharacterFighting.mainCharacterHP -= getRandomNumber(10, 20);
        }
        if(bigRedHP <= 0)
        {
            resetStatic();
            Wallet.wallet += 100;
            FightButton.punch = false;
            MainCharacter.canMove = true;
            FightButton.enemyTurnAnimations = false;
            bigRed = false;
            bigRedBeated = true;
            Greenfoot.setWorld(new BigRedBattleAfter());
        }
    }
}
