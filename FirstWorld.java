import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FirstWorld here.
 * 
 * @author Jonathan Zhao
 * @version 1
 */
public class FirstWorld extends World
{   
    Label instruction1 = new Label("Press  <w>  <a>  <s>  <d>  to move", 50);
    public FirstWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        
        addObject(instruction1, 400, 100);
        
        MainCharacter mainCharacter = new MainCharacter();
        addObject(mainCharacter, 400, 400);
        
        
        // Create a friendly NPC
        TutorialNPC friendNPC = new TutorialNPC();
        addObject(friendNPC, 800, 400);
        
        // Reset all variables
        Wallet.resetStatic();
        TutorialNPC2Fighting.resetStatic();
        MainCharacterFighting.resetStatic();
        Potion.resetStatic();
        TheShop.resetStatic();
        GobletOfYabba.resetStatic();
        SpearOfKulbally.resetStatic();
        TomeOfRebaer.resetStatic();
        MainCharacter.resetStatic();
        YesButtonHeal.resetStatic();
        TheRedsFighting.resetStatic();
        TheReds.resetStatic();
        FightButton.resetStatic();
        FightButtonTutorial.resetStatic();
    }
    
    
    

}
