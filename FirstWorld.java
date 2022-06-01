import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FirstWorld here.
 * 
 * @author Jonathan Zhao
 * @version 1
 */
public class FirstWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public static int currentTextNumber = 1;
    
    public FirstWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        
        MainCharacter mainCharacter = new MainCharacter();
        addObject(mainCharacter, 400, 400);
        
        // Create a friendly NPC
        FriendNPC friendNPC = new FriendNPC();
        addObject(friendNPC, 800, 400);
        
        
    }
    

}
