import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A friendly non playable character
 * 
 * @author Jonathan Zhao
 * @version 2
 */
public class FriendNPC extends Actor
{
    /**
     * Act - do whatever the FriendNPC wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        setImage("images/NPCs/FriendNPC.png");  
        talk();
    }
    
    // Interact with main character
    private GreenfootImage text1;
    public void talk()
    {
        text1 = new GreenfootImage("images/CharacterText/Text1.png");
        if(isTouching(MainCharacter.class))
        {
            setImage(text1);
            
        }
    }
}
