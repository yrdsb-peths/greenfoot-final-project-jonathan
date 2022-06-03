import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A bag that you can open in a fight to use items.
 * 
 * @author Jonathan Zhao
 * @version June 3
 */
public class FightingBagButton extends Actor
{
    public void act()
    {
        if(Greenfoot.mouseMoved(this))
        {
            setImage("images/CharacterText/BagButton1.png");
        }
        if(Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this))
        {
            setImage("images/CharacterText/BagButton.png");
        }
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new ItemBag(getWorld()));
        }
    }
}
