import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Temple after collecting all three relics
 * 
 * @author Jonathan Zhao
 * @version June 19
 */
public class TempleCrumble extends World
{
    Text text81 = new Text(81);
    public TempleCrumble()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        
        Greenfoot.playSound("sounds/Crumble.wav");
        
        addObject(text81, 600, 650);
        
    }
    
    public void act()
    {
        Soundtrack.stopAll();
        
        if(Greenfoot.mouseClicked(text81))
        {    
            Greenfoot.setWorld(new FinalBattlePre());
        }
    }
}
