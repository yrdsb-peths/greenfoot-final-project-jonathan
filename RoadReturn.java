import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Brings main character back to the world they came from
 * 
 * @author Jonathan Zhao 
 * @version June 14
 */
public class RoadReturn extends Actor
{
    World returnWorld;
    public void act()
    {
        if(isTouching(MainCharacter.class))
        {
            Greenfoot.setWorld(returnWorld);
        }
    }
    
    public RoadReturn(World returnWorld)
    {
        this.returnWorld = returnWorld;
    }
}
