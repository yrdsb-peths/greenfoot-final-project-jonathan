import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The death screen. 
 * 
 * @author Jonathan Zhao
 * @version June 12
 */
public class YouDied extends World
{
    public YouDied()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        RestartButton restart = new RestartButton();
        if(YesButtonHeal.hasCheckpoint)
        {
            
            addObject(restart, 400, 600);
            
            LoadCheckpointButton load = new LoadCheckpointButton();
            addObject(load, 800, 600);
        }
        else
        {
            addObject(restart, 600, 600);
        }
            
    }
}
