import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Says goodbye to the merchant instead of buying anything
 * 
 * @author Jonathan Zhao
 * @version June 2
 */
public class ByeButton extends Actor
{
    
    public void act()
    {
        if(Greenfoot.mouseMoved(this))
        {
            setImage("images/CharacterText/ByeButton2.png");
        }
        if(Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this))
        {
            setImage("images/CharacterText/ByeButton1.png");
        }
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new World2Ver4(getWorld()));
        }
    }
}
