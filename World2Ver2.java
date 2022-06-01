import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * World 2 after the fight
 * 
 * @author Jonathan Zhao
 * @version June 1
 */
public class World2Ver2 extends World
{

    
    public World2Ver2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        
        MainCharacter mainCharacter = new MainCharacter();
        addObject(mainCharacter, 800, 70);
        
        // Create a friendly NPC
        TutorialNPC2 friendNPC = new TutorialNPC2();
        addObject(friendNPC, 800, 50);
        
        // Add wallet
        Wallet wallet = new Wallet();
        Wallet.walletLabel.setValue("$" + Wallet.wallet);
        addObject(Wallet.walletLabel, 40, 20);
    }
}
