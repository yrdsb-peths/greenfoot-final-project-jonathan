import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A portal that takes you to the next map
 * 
 * @author Jonathan Zhao 
 * @May 31
 */
public class RoadToWorld2 extends Actor
{ 
    public void act()
    {
        if(isTouching(MainCharacter.class))
        {
            Greenfoot.setWorld(new World2());
        }
    }
}
