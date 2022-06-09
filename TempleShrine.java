import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The shrines of the temples
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
        if(GobletOfYabba.placedGoblet)
        {
            setImage("images/ShrineWithYabba.png"); // shrine with goblet on it
        }
        else if(SpearOfKulbally.placedSpear)
        {
            setImage("images/ShrineWithKulbally.png");
        }
        else if(TomeOfRebaer.placedTome)
        {
            setImage("images/ShrineWithRebaer.png");
        }
        else
        {
            setImage("images/TheShrine.png"); // shrine without anything
        }
    }
}
