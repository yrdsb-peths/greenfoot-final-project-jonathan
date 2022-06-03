import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Road that travels to the temple
 * 
 * @author Jonathan Zhao
 * @version June 3
 */
public class RoadToTemple extends Actor
{
    public void act()
    {
        if(isTouching(MainCharacter.class))
        {
            Greenfoot.setWorld(new Temple());
        }
    }
}
