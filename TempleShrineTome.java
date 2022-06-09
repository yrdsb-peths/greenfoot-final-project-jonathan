import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The shrines of the temples
 * Holy Relics must be placed here for something to happen
 * 
 * @author Jonathan Zhao
 * @version June 7
 */
public class TempleShrineTome extends Actor
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
        if(TomeOfRebaer.placedTome)
        {
            setImage("images/ShrineWithRebaer.png"); // shrine with tome
        }
        else
        {
            setImage("images/TheShrine.png"); // shrine without anything
        }
    }
}
