import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Merchant's shop
 * 
 * @author Jonathan Zhao
 * @version June 2
 */
public class TheShop extends World
{
    World returnWorld;
    
    public static int relicsBought = 0;
    public static void resetStatic()
    {
        relicsBought = 0;
    }
    
    public TheShop(World returnWorld)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        this.returnWorld = returnWorld;
        ShopPotion potion = new ShopPotion();
        addObject(potion, 200, 450);
        Text text40 = new Text(40);
        addObject(text40, 600, 100);
        LeaveStoreButton leaveStoreButton = new LeaveStoreButton();
        addObject(leaveStoreButton, 150, 100);
        // Add wallet
        Wallet wallet = new Wallet();
        Wallet.walletLabel.setValue("$" + Wallet.wallet);
        addObject(Wallet.walletLabel, 100, 20);
        
        // Price tags
        Label potionPriceTag = new Label("$5", 50);
        Label gobletPriceTag = new Label("$100", 50);
        Label spearPriceTag = new Label("$100", 50);
        Label tomePriceTag = new Label("$100", 50);
        addObject(potionPriceTag, 200, 450);
        
        
        
        if(!GobletOfYabba.hasGoblet && !GobletOfYabba.placedGoblet)
        {
            ShopGoblet shopGoblet = new ShopGoblet();
            addObject(shopGoblet, 500, 450);
            addObject(gobletPriceTag, 500, 450);
        }
        
        if(!SpearOfKulbally.hasSpear && !SpearOfKulbally.placedSpear)
        {
            ShopSpear shopSpear = new ShopSpear();
            addObject(shopSpear, 750, 500);
            addObject(spearPriceTag, 750, 450);
        }
        
        if(!TomeOfRebaer.hasTome && !TomeOfRebaer.placedTome)
        {
            ShopTome shopTome = new ShopTome();
            addObject(shopTome, 1025, 500);
            addObject(tomePriceTag, 1025, 450);
        }
        
        
        
        
    }
    
    public void act()
    {
        Wallet.walletLabel.setValue("$" + Wallet.wallet);
        Soundtrack.firstWorldMusic.playLoop();
    }
    
    public void stopped()
    {
        Soundtrack.firstWorldMusic.pause();     
    }
}
