import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The headquarters after beating big red
 * Big red acts like a merchant here and sells weapons.
 * 
 * @author Jonathan Zhao
 * @version June 15
 */
public class HeadquartersVer2 extends World
{
    Label mainCharacterHPLabel = new Label("HP: " + MainCharacterFighting.mainCharacterHP, 50);
    
    public HeadquartersVer2(World returnWorld)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        
        MainCharacter mainCharacter = new MainCharacter();
        addObject(mainCharacter, 600, 400);
        
        // Create a road back to Gates
        RoadToGates road = new RoadToGates();
        addObject(road, 1200, 400);
        
        // Create main character's hp
        addObject(mainCharacterHPLabel, 100, 60);
        
        // Add wallet
        Wallet wallet = new Wallet();
        Wallet.walletLabel.setValue("$" + Wallet.wallet);
        addObject(Wallet.walletLabel, 100, 20);
        
        // Create Big Red
        BigRedVer2 bigRed = new BigRedVer2();
        addObject(bigRed, 600, 400);
    }
    
    public void act()
    {
        mainCharacterHPLabel.setValue("HP: " + MainCharacterFighting.mainCharacterHP);

    }
}
