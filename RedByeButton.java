import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Bye button for Big Red's shop
 * 
 * @author Jonathan Zhao 
 * @version June 15
 */
public class RedByeButton extends Actor
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
            Greenfoot.setWorld(new HeadquartersVer2(getWorld()));
            MainCharacter.canMove = true;
        }
    }
}
