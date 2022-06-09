import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The shrines of the temples
 * Holy Relics must be placed here for something to happen
 * 
 * @author Jonathan Zhao
 * @version June 7
 */
public class TempleShrineGoblet extends Actor
{
    public boolean textSpawned = false;
    public void act()
    {
        Temple world = (Temple) getWorld();
        
        
        if(isTouching(MainCharacter.class) && !textSpawned)
        {
            Text text61 = new Text(61);
            world.addObject(text61, 600, 650);
            UseGobletButton useButton = new UseGobletButton();
            world.addObject(useButton, 400, 700);
            NoButtonRelicUse noButton = new NoButtonRelicUse();
            world.addObject(noButton, 890, 700);
            textSpawned = true;
        }
        if(GobletOfYabba.placedGoblet)
        {
            setImage("images/ShrineWithYabba.png"); // shrine with goblet on it
        }
        else
        {
            setImage("images/TheShrine.png"); // shrine without anything
        }
    }
}
