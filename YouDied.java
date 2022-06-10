import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class YouDied here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class YouDied extends World
{

    /**
     * Constructor for objects of class YouDied.
     * 
     */
    public YouDied()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        
        RestartButton restart = new RestartButton();
        addObject(restart, 400, 600);
    }
}
