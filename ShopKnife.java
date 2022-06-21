import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The throwing knives in the shop
 * 
 * @author Jonathan Zhao 
 * @version June 15
 */
public class ShopKnife extends Actor
{
    public void act()
    {
        setImage("images/ThrowingKnife.png");
        if(Greenfoot.mouseClicked(this) || Greenfoot.mouseClicked(RedShop.knifePriceTag))
        {
            RedShop world = (RedShop) getWorld();
            Text text74 = new Text(74); 
            world.addObject(text74, 600, 400);
            BuyKnifeButton buyKnifeButton = new BuyKnifeButton();
            world.addObject(buyKnifeButton, 400, 450);
            BuyItemNoButtonRed noButton = new BuyItemNoButtonRed();
            world.addObject(noButton, 800, 450);
        }
    }
}
