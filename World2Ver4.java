import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A fourth world 2 that has a healing station (NPC2) and a shop (the merchant)
 * 
 * @author Jonathan Zhao 
 * @version June 3
 */
public class World2Ver4 extends World
{
    Label mainCharacterHPLabel = new Label("HP: " + MainCharacterFighting.mainCharacterHP, 50);
    World returnWorld;
    
    public World2Ver4(World returnWorld)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        this.returnWorld = returnWorld;
        MainCharacter mainCharacter = new MainCharacter();
        addObject(mainCharacter, 300, 650);
        
        // Create a friendly NPC
        TutorialNPC2Ver3 friendNPC = new TutorialNPC2Ver3();
        addObject(friendNPC, 800, 50);
        
        // Create main character's hp
        addObject(mainCharacterHPLabel, 100, 60);
        
        // Create merchant
        Merchant merchant = new Merchant();
        addObject(merchant, 300, 700);
        
        // Create roads to the north and west
        RoadToTemple roadTemple = new RoadToTemple();
        RoadToStronghold roadStronghold = new RoadToStronghold();
        addObject(roadTemple, 600, 0);
        addObject(roadStronghold, 0, 400);
        
        
        // Add wallet
        Wallet wallet = new Wallet();
        Wallet.walletLabel.setValue("$" + Wallet.wallet);
        addObject(Wallet.walletLabel, 100, 20);
    }
}