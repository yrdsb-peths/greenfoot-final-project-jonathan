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
        RoadToStronghold road = new RoadToStronghold();
        addObject(road, 1200, 400);
        
        // Create a road to headquarters
        RoadToHeadquarters roadHQ = new RoadToHeadquarters();
        addObject(roadHQ, 0, 400);
        
        // Create main character's hp
        addObject(mainCharacterHPLabel, 100, 60);
        
        // Add wallet
        Wallet wallet = new Wallet();
        Wallet.walletLabel.setValue("$" + Wallet.wallet);
        addObject(Wallet.walletLabel, 100, 20);
        
    }
    
    public void act()
    {
        mainCharacterHPLabel.setValue("HP: " + MainCharacterFighting.mainCharacterHP);

    }
    
    
}
