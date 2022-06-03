import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Gets the acknowledgement of the player when they can't use an item.
 * Resets the item bag
 * 
 * @author Jonathan Zhao 
 * @version June 3
 */
public class ItemOKButton extends Actor
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
            Greenfoot.setWorld(new ItemBag(getWorld()));
        }
    }
}
