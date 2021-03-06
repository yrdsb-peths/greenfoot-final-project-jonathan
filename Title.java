import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title screen of game
 * Game starts here
 * 
 * @author Jonathan Zhao
 * @version 1
 */
public class Title extends World
{
 
    public Title()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        prepare();
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            FirstWorld gameWorld = new FirstWorld();
            Greenfoot.setWorld(gameWorld);
        }
        Soundtrack.stopAll();
    }
    
    /**
     * Prepares the world for the start of the program.
     */
    private void prepare()
    {
    }
}
