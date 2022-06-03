import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Leaves the store
 * 
 * @author Jonathan Zhao
 * @version June 2
 */
public class LeaveStoreButton extends Actor
{
    World returnWorld;
    
    public LeaveStoreButton(World returnWorld)
    {
        this.returnWorld = returnWorld;
    }
    
    
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
            Greenfoot.setWorld(returnWorld);
        }
    }
}
