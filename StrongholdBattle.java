import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Fighting world in stronghold
 * 
 * @author Jonathan Zhao 
 * @version June 6
 */
public class StrongholdBattle extends World
{
    Label mainCharacterHPLabel = new Label("HP: " + MainCharacterFighting.mainCharacterHP, 50);
    Label redHPLabel = new Label("HP: " + TheRedsFighting.redHP, 50);
    public StrongholdBattle()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        
        // Create the main character
        MainCharacterFighting mainCharacterFighting = new MainCharacterFighting();
        addObject(mainCharacterFighting, 200, 650);
        
        // Create enemy's hp
        addObject(redHPLabel, 1100, 60);
        
        // Create the enemy
        TheRedsFighting theReds = new TheRedsFighting();
        addObject(theReds, 800, 500);
        TheRedsFighting.theReds = true; // Is fighting the reds
        
        // Create main character's hp
        addObject(mainCharacterHPLabel, 100, 60);
        
        // Create the fight button
        FightButton fightButton = new FightButton();
        addObject(fightButton, 400, 750);
        
        // Create the bag button
        FightingBagButton fightingBagButton = new FightingBagButton();
        addObject(fightingBagButton, 800, 750);
    }
    
    public void act()
    {
        mainCharacterHPLabel.setValue("HP: " + MainCharacterFighting.mainCharacterHP);
        redHPLabel.setValue("HP: " + TheRedsFighting.redHP);
        Soundtrack.fightingMusic.playLoop();
        Soundtrack.stopAllExceptFighting();
    }
    
    public void stopped()
    {
        Soundtrack.fightingMusic.pause();     
    }
}
