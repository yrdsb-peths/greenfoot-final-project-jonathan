import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Text here.
 * 
 * @author Jonathan Zhao
 * @version (a version number or a date)
 */
public class Text extends Actor
{
    /**
     * Act - do whatever the Text wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    
    public Text(int id)
    {
        if(id == 1)
        {
            setImage("images/CharacterText/Text1.png");
        }
        
        if(id == 2)
        {
            FirstWorld world = (FirstWorld) getWorld();
            setImage("images/CharacterText/Text2.png");
        }
        
        if(id == 3)
        {
            FirstWorld world = (FirstWorld) getWorld();
            setImage("images/CharacterText/Text3.png");
        }
        
        if(id == 4)
        {
            setImage("images/CharacterText/Text4.png");
        }
    }
    
    public void act()
    {
        
    }
}
