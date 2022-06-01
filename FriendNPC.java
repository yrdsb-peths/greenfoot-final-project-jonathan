import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A friendly non playable character
 * 
 * @author Jonathan Zhao
 * @version 2
 */
public class FriendNPC extends Actor
{
    public boolean text1Spawned = false;
    public boolean instruction1Spawned = false;
    
    public void act()
    {
        setImage("images/NPCs/FriendNPC.png");  
        talk();
    }

    // Interact with main character
      
    public void talk()
    {
        if(isTouching(MainCharacter.class) && !instruction1Spawned)
        {
            FirstWorld world = (FirstWorld) getWorld();
            Label instruction1 = new Label("Press <f> to interact", 50);
            world.addObject(instruction1, 800, 300);
            instruction1Spawned = true;
            
        }
        
        
        if(isTouching(MainCharacter.class) && Greenfoot.isKeyDown("f") && !text1Spawned)
        { 
            FirstWorld world = (FirstWorld) getWorld();
            Text text1 = new Text(1);
            YesButton yesButton1 = new YesButton();
            NoButton noButton1 = new NoButton();
            world.addObject(text1, 600, 650);
            world.addObject(yesButton1, 760, 700);
            world.addObject(noButton1, 890, 700);
            text1Spawned = true;
        }
        
        
    }
}
