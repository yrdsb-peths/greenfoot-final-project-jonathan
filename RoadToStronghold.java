import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Road that travels to the stronghold
 * 
 * @author Jonathan Zhao
 * @version June 3
 */
public class RoadToStronghold extends Actor
{
    public void act()
    {
        if(isTouching(MainCharacter.class))
        {
            Greenfoot.setWorld(new Stronghold());
        }
    }
}
