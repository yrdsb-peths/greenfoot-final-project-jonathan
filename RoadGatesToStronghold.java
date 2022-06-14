import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Brings main character from the gates back to stronghold
 * 
 * @author Jonathan Zhao 
 * @version June 13
 */
public class RoadGatesToStronghold extends Actor
{
    World returnWorld;
    public void act()
    {
        if(isTouching(MainCharacter.class))
        {
            Greenfoot.setWorld(returnWorld);
        }
    }
    
    public RoadGatesToStronghold(World returnWorld)
    {
        this.returnWorld = returnWorld;
    }
}
