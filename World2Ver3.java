import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A new world where NPC 2 has different lines
 * 
 * @author Jonathan Zhao 
 * @version June 2
 */
public class World2Ver3 extends World
{
    Label mainCharacterHPLabel = new Label("HP: " + MainCharacterFighting.mainCharacterHP, 50);
    
    public World2Ver3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        
        MainCharacter mainCharacter = new MainCharacter();
        addObject(mainCharacter, 800, 100);
        
        // Create a friendly NPC
        TutorialNPC2Nothing friendNPC = new TutorialNPC2Nothing();
        addObject(friendNPC, 800, 50);
        
        // Create main character's hp
        addObject(mainCharacterHPLabel, 100, 60);
        
        // Create tutorial merchant
        MerchantTutorial merchantTutorial = new MerchantTutorial();
        addObject(merchantTutorial, 300, 700);
        
        // Add wallet
        Wallet wallet = new Wallet();
        Wallet.walletLabel.setValue("$" + Wallet.wallet);
        addObject(Wallet.walletLabel, 100, 20);
    }
}
