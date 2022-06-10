import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Use button that places the Goblet of Yabba on the shrine.
 * 
 * @author Jonathan Zhao
 * @version June 9
 */
public class UseGobletButton extends Actor
{
    public void act()
    {
        if(Greenfoot.mouseMoved(this))
        {
            setImage("images/CharacterText/Use2.png");
        }
        if(Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this))
        {
            setImage("images/CharacterText/Use1.png");
        }
        if(Greenfoot.mouseClicked(this))
        {
            GobletOfYabba.placedGoblet = true;
            GobletOfYabba.hasGoblet = false;
            MainCharacter.canMove = true;
        }
    }
}
