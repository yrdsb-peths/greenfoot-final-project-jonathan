import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Big Red fighting
 * 
 * @author Jonathan Zhao 
 * @version June 15
 */
public class AngelFighting extends Actor
{
    SimpleTimer animationTimer = new SimpleTimer();
    GreenfootImage[] fighting = new GreenfootImage[7];
    GreenfootImage[] gettingHit = new GreenfootImage[2];
    GreenfootImage[] attack = new GreenfootImage[3];
    
    public static int angelHP = 500;
    public static boolean angel = false; // Is true when fighting angel
    
    // Reset statics
    public static void resetStatic()
    {
        angelHP = 500;
        angel = false;
    }
    
    public AngelFighting()
    {
        // Animation for getting hit
        for(int i = 0; i < 2; i++)
        {
            gettingHit[i] = new GreenfootImage("images/NPCs/AngelFight/AngelDamage00" + i + ".png");
        }
        setImage(gettingHit[0]);
        
        // Animation for attacking
        for(int i = 0; i < 3; i++)
        {
            attack[i] = new GreenfootImage("images/NPCs/AngelFight/AngelAttack00" + i + ".png");
        }
        setImage(attack[0]);
        
        // Animation for idle
        for(int i = 0; i < 7; i++)
        {
            fighting[i] = new GreenfootImage("images/NPCs/AngelFight/AngelFight00" + i + ".png");
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
            setImage("images/NPCs/AngelFight/AngelDamage000.png");
            if(animationTimer.millisElapsed() < 270)
            {
                return;
            }
            setImage("images/NPCs/AngelFight/AngelDamage001.png");
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
            setImage("images/NPCs/AngelFight/AngelAttack000.png");
            if(animationTimer.millisElapsed() < 270)
            {
                return;
            }
            setImage("images/NPCs/AngelFight/AngelAttack001.png");
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
        if(angelHP <= 0)
        {
            resetStatic();
            FightButton.punch = false;
            MainCharacter.canMove = true;
            FightButton.enemyTurnAnimations = false;
            angel = false;
            Greenfoot.setWorld(new FinalBattlePost());
        }
    }
}
