import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A potion that heals 45 HP for the main character
 * 
 * @author Jonathan Zhao
 * @version June 2
 */
public class Potion extends Actor
{
    public static int numberPotions = 0;
    public static boolean usePotion = false;
    public static void resetStatic()
    {
        numberPotions = 0;
    }
    
    public void act()
    {
        setImage("images/Potion.png");
        if(usePotion)
        {
            MainCharacterFighting.mainCharacterHP += 45;
            
            usePotion = false;
        }
    }
}
