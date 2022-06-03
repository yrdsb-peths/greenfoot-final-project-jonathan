import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Brings main character from the temple back to World2Ver4
 * 
 * @author Jonathan Zhao 
 * @version June 3
 */
public class RoadTempleToWorld2Ver4 extends Actor
{
    public void act()
    {
        if(isTouching(MainCharacter.class))
        {
            Greenfoot.setWorld(new World2Ver4FromTemple(getWorld()));
        }
    }
}
