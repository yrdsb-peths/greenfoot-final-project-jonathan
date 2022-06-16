import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A world that is the item bag. Holds potions and Holy Relics
 * 
 * @author Jonathan Zhao 
 * @version June 2
 */
public class ItemBag extends World
{   
    Label numberOfPotionsLabel = new Label("x" + Potion.numberPotions, 70);
    Label numberOfKnivesLabel = new Label("x" + ThrowingKnife.numberKnives, 70);
    Label mainCharacterHPLabel = new Label("HP: " + MainCharacterFighting.mainCharacterHP, 50);
    World returnWorld;
    
    
    public ItemBag(World returnWorld)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        this.returnWorld = returnWorld;
        Potion potion = new Potion();
        ThrowingKnife knife = new ThrowingKnife();
        Text itemBag = new Text(38);
        addObject(itemBag, 600, 100);
        addObject(potion, 200, 350);
        addObject(numberOfPotionsLabel, 200, 350);
        addObject(knife, 200, 650);
        addObject(numberOfKnivesLabel, 200, 650);
        
        // Create main character's hp
        addObject(mainCharacterHPLabel, 100, 60);
        
        if(GobletOfYabba.hasGoblet && !GobletOfYabba.placedGoblet)
        {
            GobletOfYabba gobletOfYabba = new GobletOfYabba();
            addObject(gobletOfYabba, 500, 350);
        }
        
        if(SpearOfKulbally.hasSpear && !SpearOfKulbally.placedSpear)
        {
            SpearOfKulbally spearOfKulbally = new SpearOfKulbally();
            addObject(spearOfKulbally, 750, 400);
        }
        
        if(TomeOfRebaer.hasTome && !TomeOfRebaer.placedTome)
        {
            TomeOfRebaer tomeOfRebaer = new TomeOfRebaer();
            addObject(tomeOfRebaer, 1025, 400);
        }
        
    }
    
    public void act()
    {
        numberOfPotionsLabel.setValue("x" + Potion.numberPotions);
        mainCharacterHPLabel.setValue("HP: " + MainCharacterFighting.mainCharacterHP);
        numberOfKnivesLabel = new Label("x" + ThrowingKnife.numberKnives, 70);
        if(Greenfoot.isKeyDown("escape"))
        {
            Greenfoot.setWorld(returnWorld);
            
        }
    }
}
