import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Road that travels to the headquarters
 * 
 * @author Jonathan Zhao
 * @version June 14
 */
public class RoadToHeadquarters extends Actor
{
    public void act()
    {
        if(isTouching(MainCharacter.class) && BigRedFighting.bigRedBeated == false)
        {
            Greenfoot.setWorld(new Headquarters(getWorld()));
        }
        else if(isTouching(MainCharacter.class) && BigRedFighting.bigRedBeated)
        {
            Greenfoot.setWorld(new HeadquartersVer2(getWorld()));
        }
    }
}
