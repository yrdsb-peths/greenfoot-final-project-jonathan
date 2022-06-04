import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Spear of Kulbally in the shop
 * 
 * @author Jonathan Zhao
 * @version June 3
 */
public class ShopSpear extends Actor
{ 
    public void act()
    {
        setImage("images/TheSpearOfKulbally.png");
        if(Greenfoot.mouseClicked(this))
        {
            TheShop world = (TheShop) getWorld();
            Text text45 = new Text(45); 
            world.addObject(text45, 600, 400);
            BuySpearButton buySpearButton = new BuySpearButton();
            world.addObject(buySpearButton, 400, 450);
            BuyItemNoButton noButton = new BuyItemNoButton();
            world.addObject(noButton, 800, 450);
        }
    }
}
