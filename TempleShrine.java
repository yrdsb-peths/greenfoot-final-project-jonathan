import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The shrine of the temples
 * Holy Relics must be placed here for something to happen
 * 
 * @author Jonathan Zhao
 * @version June 7
 */
public class TempleShrine extends Actor
{
    public static boolean touchingShrine = false;
    public void act()
    {
        if(isTouching(MainCharacter.class))
        {
            touchingShrine = true;
        }
        else
        {
            touchingShrine = false;
        }
    }
}
