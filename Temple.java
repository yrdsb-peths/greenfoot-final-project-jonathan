import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The temple
 * 
 * @author Jonathan Zhao
 * @version June 3
 */
public class Temple extends World
{
    Label mainCharacterHPLabel = new Label("HP: " + MainCharacterFighting.mainCharacterHP, 50);
    public Temple(World returnWorld)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        
        MainCharacter mainCharacter = new MainCharacter();
        addObject(mainCharacter, 600, 700);
        
        // Create a road back to World2Ver4
        RoadTempleToWorld2Ver4 road = new RoadTempleToWorld2Ver4(returnWorld);
        addObject(road, 600, 800);
        
        // Create main character's hp
        addObject(mainCharacterHPLabel, 100, 60);
        
        // Add wallet
        Wallet wallet = new Wallet();
        Wallet.walletLabel.setValue("$" + Wallet.wallet);
        addObject(Wallet.walletLabel, 100, 20);
        
        // Add shrines
        TempleShrine shrine1 = new TempleShrine();
        TempleShrine shrine2 = new TempleShrine();
        TempleShrine shrine3 = new TempleShrine();
        addObject(shrine1, 300, 400);
        addObject(shrine2, 600, 200);
        addObject(shrine3, 900, 400);
    }
    
    public void act()
    {
        mainCharacterHPLabel.setValue("HP: " + MainCharacterFighting.mainCharacterHP);

    }
}
