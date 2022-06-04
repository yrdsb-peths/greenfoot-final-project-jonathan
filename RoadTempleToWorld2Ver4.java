import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Brings main character from the temple back to World2Ver4
 * 
 * @author Jonathan Zhao 
 * @version June 3
 */
public class RoadTempleToWorld2Ver4 extends Actor
{
    World returnWorld;
    public void act()
    {
        if(isTouching(MainCharacter.class))
        {
            Greenfoot.setWorld(returnWorld);
        }
    }
    
    public RoadTempleToWorld2Ver4(World returnWorld)
    {
        this.returnWorld = returnWorld;
    }
}
