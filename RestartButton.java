import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Restarts the game when user dies
 * 
 * @author Jonathan Zhao 
 * @version June 10
 */
public class RestartButton extends Actor
{
    public void act()
    {
        if(Greenfoot.mouseMoved(this))
        {
            setImage("images/CharacterText/RestartButton2.png");
        }
        if(Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this))
        {
            setImage("images/CharacterText/RestartButton1.png");
        }
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Title());
        }
    }
}
