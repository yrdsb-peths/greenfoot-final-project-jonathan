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
    
    public TheShop(World returnWorld)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        this.returnWorld = returnWorld;
        Potion potion = new Potion();
        addObject(potion, 200, 450);
        Text text40 = new Text(40);
        addObject(text40, 600, 100);
        LeaveStoreButton leaveStoreButton = new LeaveStoreButton(returnWorld);
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
        
        
        
        if(!GobletOfYabba.hasGoblet)
        {
            GobletOfYabba gobletOfYabba = new GobletOfYabba();
            addObject(gobletOfYabba, 500, 450);
        }
        
        if(!SpearOfKulbally.hasSpear)
        {
            SpearOfKulbally spearOfKulbally = new SpearOfKulbally();
            addObject(spearOfKulbally, 750, 500);
        }
        
        if(!TomeOfRebaer.hasTome)
        {
            TomeOfRebaer tomeOfRebaer = new TomeOfRebaer();
            addObject(tomeOfRebaer, 1025, 500);
        }
        
        addObject(gobletPriceTag, 500, 450);
        addObject(spearPriceTag, 750, 450);
        addObject(tomePriceTag, 1025, 450);
    }

}
