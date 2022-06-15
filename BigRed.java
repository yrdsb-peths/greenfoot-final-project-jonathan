import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A semi boss
 * 
 * @author Jonathan Zhao
 * @version June 14
 */
public class BigRed extends Actor
{
    public boolean firstTextSpawned = false;
    
    public void act()
    {
        talk();
        setImage("images/NPCs/BigRed.png");
    }
    
    
    Text text65 = new Text(65);
    Text text66 = new Text(66);
    
    public void talk()
    {
        if(isTouching(MainCharacter.class) && firstTextSpawned == false)
        {
            Headquarters world = (Headquarters) getWorld();
            world.addObject(text65, 600, 650);
            firstTextSpawned = true;
            MainCharacter.canMove = false;
        }
        if(Greenfoot.mouseClicked(text65))
        {
            Headquarters world = (Headquarters) getWorld();
            world.addObject(text66, 600, 650);
        }
        if(Greenfoot.mouseClicked(text66))
        {
            Greenfoot.setWorld(new BigRedBattle());
        }
    }
}
