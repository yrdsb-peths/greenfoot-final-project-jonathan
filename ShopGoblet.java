import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Goblet of Yabba in the shop
 * 
 * @Jonathan Zhao 
 * @version June 3
 */
public class ShopGoblet extends Actor
{
    public static boolean firstHolyRelic = true;
    public static void resetStatic()
    {
        firstHolyRelic = true;
    }
    
    public void act()
    {
        setImage("images/TheGobletOfYabba.png");
        if(Greenfoot.mouseClicked(this))
        {
            TheShop world = (TheShop) getWorld();
            Text text44 = new Text(44); 
            world.addObject(text44, 600, 400);
            BuyGobletButton buyGobletButton = new BuyGobletButton();
            world.addObject(buyGobletButton, 400, 450);
            BuyItemNoButton noButton = new BuyItemNoButton();
            world.addObject(noButton, 800, 450);
        }
    }
}
