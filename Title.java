import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title screen of game
 * 
 * @author Jonathan Zhao
 * @version 1
 */
public class Title extends World
{
    Label titleLabel = new Label("To Be Determined", 75);
    
    /**
     * Constructor for objects of class Title.
     * 
     */
    public Title()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        addObject(titleLabel, 300, 100);
        prepare();
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
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
