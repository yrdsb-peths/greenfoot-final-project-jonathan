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
    GreenfootImage[] fighting = new GreenfootImage[11];
    GreenfootImage[] gettingHit = new GreenfootImage[2];
    GreenfootImage[] attack = new GreenfootImage[2];
    
    public static int angelHP = 500;
    public static boolean angel = false; // Is true when fighting angel
    
    // Reset statics
    public static void resetStatic()
    {
        angelHP = 250;
        angel = false;
    }
    
    
    
    
    
    public int getRandomNumber(int start, int end) // Gets random number between two numbers
    {
        int normal = Greenfoot.getRandomNumber(end-start+1);
        return normal + start;
    }
    public void act()
    {
        setImage("images/NPCs/AngelFight/AngelFight000.png");
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
