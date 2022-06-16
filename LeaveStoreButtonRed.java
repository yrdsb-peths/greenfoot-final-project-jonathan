import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Leaves big red's store
 * 
 * @author Jonathan Zhao 
 * @version June 15
 */
public class LeaveStoreButtonRed extends Actor
{
    public void act()
    {
        if(Greenfoot.mouseMoved(this))
        {
            setImage("images/CharacterText/LeaveStoreButton2.png");
        }
        if(Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this))
        {
            setImage("images/CharacterText/LeaveStoreButton.png");
        }
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new HeadquartersVer2(getWorld()));
            MainCharacter.canMove = true;
        }
    }
}
