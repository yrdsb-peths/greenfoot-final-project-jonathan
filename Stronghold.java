import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The stronghold
 * 
 * @author Jonathan Zhao 
 * @version June 3
 */
public class Stronghold extends World
{
    
    Label mainCharacterHPLabel = new Label("HP: " + MainCharacterFighting.mainCharacterHP, 50);
    
    public Stronghold(World returnWorld)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        
        MainCharacter mainCharacter = new MainCharacter();
        addObject(mainCharacter, 1100, 400);
        
        // Create a road back to World2Ver4
        RoadToWorld2Ver4 road = new RoadToWorld2Ver4();
        addObject(road, 1200, 400);
        
        // Create a road to gates
        RoadToGates roadGate = new RoadToGates();
        addObject(roadGate, 0, 400);
        
        // Create main character's hp
        addObject(mainCharacterHPLabel, 100, 60);
        
        // Add wallet
        Wallet wallet = new Wallet();
        Wallet.walletLabel.setValue("$" + Wallet.wallet);
        addObject(Wallet.walletLabel, 100, 20);
        
        // Create enemy 
        TheReds theReds = new TheReds();
        addObject(theReds, 400, 400);
        theReds.setRotation(270);
    }
    
    public void act()
    {
        mainCharacterHPLabel.setValue("HP: " + MainCharacterFighting.mainCharacterHP);
        Soundtrack.secondWorldMusic.playLoop();
        Soundtrack.stopAllExceptWorld2();
    }
    
    public void stopped()
    {
        Soundtrack.secondWorldMusic.pause();     
    }
}
