import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Leaves the store
 * 
 * @author Jonathan Zhao
 * @version June 2
 */
public class LeaveStoreButton extends Actor
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
            Greenfoot.setWorld(new World2Ver4(getWorld()));
            MainCharacter.canMove = true;
        }
    }
}
