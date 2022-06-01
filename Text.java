import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Texts in the game.
 * 
 * @author Jonathan Zhao
 * @version June 1
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
        
        if(id == 5)
        {
            setImage("images/CharacterText/Text5.png");
        }
        
        if(id == 6)
        {
            setImage("images/CharacterText/Text6.png");
        }
        
        if(id == 7)
        {
            setImage("images/CharacterText/Text7.png");
        }
        
        if(id == 8)
        {
            setImage("images/CharacterText/Text8.png");
        }
        
        if(id == 9)
        {
            setImage("images/CharacterText/Text9.png");
        }
        
        if(id == 10)
        {
            setImage("images/CharacterText/Text10.png");
        }
        
        if(id == 11)
        {
            setImage("images/CharacterText/Text11.png");
        }
        
        if(id == 12)
        {
            setImage("images/CharacterText/Text12.png");
        }
        
        if(id == 13)
        {
            setImage("images/CharacterText/Text13.png");
        }
    }
    
    public void act()
    {
        
    }
}
