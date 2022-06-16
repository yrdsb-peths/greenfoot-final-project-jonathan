import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Gets the player to acknowledge that they can not afford the item in Big Red's shop
 * 
 * @author Jonathan Zhao
 * @version June 15
 */
public class BuyOkButtonRed extends Actor
{
    public void act()
    {
        if(Greenfoot.mouseMoved(this))
        {
            setImage("images/CharacterText/OkayButton2.png");
        }
        if(Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this))
        {
            setImage("images/CharacterText/OkayButton1.png");
        }
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new RedShop(getWorld()));
        }
    }
}
