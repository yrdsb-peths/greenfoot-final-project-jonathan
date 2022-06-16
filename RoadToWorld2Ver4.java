import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Brings main character to world 2 version 4
 * 
 * @author Jonathan Zhao 
 * @version June 14
 */
public class RoadToWorld2Ver4 extends Actor
{
    public void act()
    {
        if(isTouching(MainCharacter.class))
        {
            Greenfoot.setWorld(new World2Ver4(getWorld()));
        }
    }
}
