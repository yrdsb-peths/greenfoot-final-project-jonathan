import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Tome of Rebaer in the shop
 * 
 * @author Jonathan Zhao
 * @version June 3
 */
public class ShopTome extends Actor
{
    public void act()
    {
        setImage("images/TheTomeOfRebaer.png");
        if(Greenfoot.mouseClicked(this) || Greenfoot.mouseClicked(TheShop.tomePriceTag))
        {
            TheShop world = (TheShop) getWorld();
            Text text46 = new Text(46); 
            world.addObject(text46, 600, 400);
            BuyTomeButton buyTomeButton = new BuyTomeButton();
            world.addObject(buyTomeButton, 400, 450);
            BuyItemNoButton noButton = new BuyItemNoButton();
            world.addObject(noButton, 800, 450);
        }
    }
}
