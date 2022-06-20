import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * World 2 after the fight
 * 
 * @author Jonathan Zhao
 * @version June 1
 */
public class World2Ver2 extends World
{

    Label mainCharacterHPLabel = new Label("HP: " + MainCharacterFighting.mainCharacterHP, 50);
    public World2Ver2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        
        MainCharacter mainCharacter = new MainCharacter();
        addObject(mainCharacter, 800, 100);
        
        // Create main character's hp
        addObject(mainCharacterHPLabel, 100, 60);
        
        // Create a friendly NPC
        TutorialNPC2Ver2 friendNPC = new TutorialNPC2Ver2();
        addObject(friendNPC, 800, 50);
        
        // Add wallet
        Wallet wallet = new Wallet();
        Wallet.walletLabel.setValue("$" + Wallet.wallet);
        addObject(Wallet.walletLabel, 100, 20);
    }
    
    public void act()
    {
        mainCharacterHPLabel.setValue("HP: " + MainCharacterFighting.mainCharacterHP);
        Soundtrack.firstWorldMusic.playLoop();
        Soundtrack.stopAllExceptWorld1();
    }
    
    public void stopped()
    {
        Soundtrack.firstWorldMusic.pause();     
    }
}
