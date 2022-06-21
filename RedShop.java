import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Big Red's shop of weapons
 * 
 * @author Jonathan Zhao 
 * @version June 15
 */
public class RedShop extends World
{
    World returnWorld;
    // Price tags
    public static Label knifePriceTag = new Label("$25", 50);
        
    
    public RedShop(World returnWorld)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        this.returnWorld = returnWorld;
        LeaveStoreButtonRed leaveStoreButton = new LeaveStoreButtonRed();
        addObject(leaveStoreButton, 150, 100);
        Text text70 = new Text(70);
        addObject(text70, 600, 100);
        
        ShopKnife knife = new ShopKnife();
        addObject(knife, 200, 450);
        
        // Add wallet
        Wallet wallet = new Wallet();
        Wallet.walletLabel.setValue("$" + Wallet.wallet);
        addObject(Wallet.walletLabel, 100, 20);
        
        addObject(knifePriceTag, 200, 450);
        
        
    }
    
    public void stopped()
    {
        Soundtrack.secondWorldMusic.pause();     
    }
    
    public void act()
    {
        Wallet.walletLabel.setValue("$" + Wallet.wallet);
        Soundtrack.secondWorldMusic.playLoop();
    }
}
