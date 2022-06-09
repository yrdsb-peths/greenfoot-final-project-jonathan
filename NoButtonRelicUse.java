import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * No button for the option of placing the relics on the shrines
 * 
 * @author Jonathan Zhao
 * @version June 9
 */
public class NoButtonRelicUse extends Actor
{
    public void act()
    {
        if(Greenfoot.mouseMoved(this))
        {
            setImage("images/CharacterText/NoButton2.png");
        }
        if(Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this))
        {
            setImage("images/CharacterText/NoButton1.png");
        }
        if(Greenfoot.mouseClicked(this))
        {
            
        }
    }
}
