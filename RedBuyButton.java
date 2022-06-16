import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Buy button that opens Big Red's store
 * 
 * @author Jonathan Zhao 
 * @version June 15
 */
public class RedBuyButton extends Actor
{
    public void act()
    {
        if(Greenfoot.mouseMoved(this))
        {
            setImage("images/CharacterText/BuyButton2.png");
        }
        if(Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this))
        {
            setImage("images/CharacterText/BuyButton1.png");
        }
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new RedShop(getWorld()));
        }
    }
}
