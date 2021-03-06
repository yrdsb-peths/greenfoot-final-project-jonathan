import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The main character throws a punch in combat
 * 
 * @author Jonathan Zhao
 * @version June 2
 */
public class FightButton extends Actor
{
    
    public static boolean punch = false;
    public static void resetStatic()
    {
        punch = false;
    }
    
    public static boolean enemyTurn = false;
    public static boolean enemyTurnAnimations = false;
    
    public void act()
    {
        if(Greenfoot.mouseMoved(this))
        {
            setImage("images/PunchButton2.png");
        }
        if(Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this))
        {
            setImage("images/PunchButton1.png");
        }
        if(Greenfoot.mouseClicked(this))
        {
            if(TheRedsFighting.theReds)
            {
                TheRedsFighting.redHP -= Greenfoot.getRandomNumber(21);
                punch = true;
            }
            else if(BigRedFighting.bigRed)
            {
                BigRedFighting.bigRedHP -= Greenfoot.getRandomNumber(21);
                punch = true;
            }
            else if(AngelFighting.angel)
            {
                AngelFighting.angelHP -= Greenfoot.getRandomNumber(21);
                punch = true;
            }
        }
    }
}
