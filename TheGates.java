import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The gates to the main stronghold building
 * 
 * @author Jonathan Zhao 
 * @version June 13
 */
public class TheGates extends World
{
    
    Label mainCharacterHPLabel = new Label("HP: " + MainCharacterFighting.mainCharacterHP, 50);
    
    public TheGates(World returnWorld)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        
        MainCharacter mainCharacter = new MainCharacter();
        addObject(mainCharacter, 1100, 400);
        
        // Create a road back to Stronghold
        RoadGatesToStronghold road = new RoadGatesToStronghold(returnWorld);
        addObject(road, 1200, 400);
        
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

    }
    
    
}
