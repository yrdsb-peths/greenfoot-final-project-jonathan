import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NoButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NoButton extends Actor
{
    /**
     * Act - do whatever the NoButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    static Text text2 = new Text(2);
    public void act()
    {
        if(Greenfoot.mouseMoved(this))
        {
            setImage("images/CharacterText/NoButton2.png");
        }
        else
        {
            setImage("images/CharacterText/NoButton1.png");
        }
        if(Greenfoot.mouseClicked(this))
        {
            FirstWorld world = (FirstWorld) getWorld();
            world.addObject(text2, 600, 650);
            
        }
    }
}
