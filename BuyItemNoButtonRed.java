import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A button to click to not buy an item when prompted in Big Red's shop
 * 
 * @author Jonathan Zhao
 * @version June 15
 */
public class BuyItemNoButtonRed extends Actor
{
    public void act()
    {
        if(Greenfoot.mouseMoved(this))
        {
            setImage("images/CharacterText/NoItem2.png");
        }
        if(Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this))
        {
            setImage("images/CharacterText/NoItem1.png");
        }
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new RedShop(getWorld()));
        }
    }
}
