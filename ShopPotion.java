import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The potions in the shop
 * 
 * @author Jonathan Zhao 
 * @version June 3
 */
public class ShopPotion extends Actor
{
    public void act()
    {
        setImage("images/Potion.png");
        if(Greenfoot.mouseClicked(this))
        {
            TheShop world = (TheShop) getWorld();
            Text text43 = new Text(43); 
            world.addObject(text43, 600, 400);
            BuyPotionButton buyPotionButton = new BuyPotionButton();
            world.addObject(buyPotionButton, 400, 450);
            BuyItemNoButton noButton = new BuyItemNoButton();
            world.addObject(noButton, 800, 450);
            
        }
    }
}
