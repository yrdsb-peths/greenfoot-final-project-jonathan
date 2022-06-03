import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A potion that heals 45 HP for the main character
 * 
 * @author Jonathan Zhao
 * @version June 2
 */
public class Potion extends Actor
{
    public static int numberPotions = 5;
    public static boolean usePotion = false;

    public static void resetStatic()
    {
        numberPotions = 0;
    }

    public void act()
    {
        setImage("images/Potion.png");
        if(Greenfoot.mouseClicked(this))
        {
            ItemBag world = (ItemBag) getWorld();
            Text text41 = new Text(41); 
            world.addObject(text41, 600, 400);
            UsePotionYesButton yesButton = new UsePotionYesButton(getWorld());
            world.addObject(yesButton, 400, 450);
            UseItemNoButton noButton = new UseItemNoButton();
            world.addObject(noButton, 800, 450);
        }
        
    }
    
    public static void usePotion()
    {
        if(numberPotions > 0)
        {
            numberPotions -= 1;
            MainCharacterFighting.mainCharacterHP += 40;

        }
    }
}
