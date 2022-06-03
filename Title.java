import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title screen of game
 * 
 * @author Jonathan Zhao
 * @version 1
 */
public class Title extends World
{
    Label titleLabel = new Label("To Be Determined", 150);
    
    public Title()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        
        addObject(titleLabel, 600, 200);
        prepare();
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            FirstWorld gameWorld = new FirstWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepares the world for the start of the program.
     */
    private void prepare()
    {
    }
}
