import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Road that travels to the the gates
 * 
 * @author Jonathan Zhao
 * @version June 13
 */
public class RoadToGates extends Actor
{
    public void act()
    {
        if(isTouching(MainCharacter.class))
        {
            Greenfoot.setWorld(new TheGates(getWorld()));
        }
    }
}
