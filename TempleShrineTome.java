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
    public boolean textSpawned = false;
    public void act()
    {
        Temple world = (Temple) getWorld();
        if(isTouching(MainCharacter.class) && !textSpawned && TomeOfRebaer.hasTome)
        {
            Text text64 = new Text(64);
            world.addObject(text64, 600, 650);
            UseTomeButton useButton = new UseTomeButton();
            world.addObject(useButton, 400, 700);
            NoButtonRelicUse noButton = new NoButtonRelicUse();
            world.addObject(noButton, 890, 700);
            textSpawned = true;
            MainCharacter.canMove = false;
        }
        if(TomeOfRebaer.placedTome)
        {
            setImage("images/ShrineWithRebaer.png"); // shrine with tome on it
        }
        else
        {
            setImage("images/TheShrine.png"); // shrine without anything
        }
    }
}
