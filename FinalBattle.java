import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Fighting world against Big Red
 * 
 * @author Jonathan Zhao 
 * @version June 14
 */
public class FinalBattle extends World
{
    Label mainCharacterHPLabel = new Label("HP: " + MainCharacterFighting.mainCharacterHP, 50);
    Label angelHPLabel = new Label("HP: " + AngelFighting.angelHP, 50);
    public FinalBattle()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        
        // Create the main character
        MainCharacterFighting mainCharacterFighting = new MainCharacterFighting();
        addObject(mainCharacterFighting, 200, 650);
        
        // Create enemy's hp
        addObject(angelHPLabel, 1100, 60);
        
        // Create the enemy
        AngelFighting angel = new AngelFighting();
        addObject(angel, 800, 500);
        AngelFighting.angel = true;
        
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
        angelHPLabel.setValue("HP: " + AngelFighting.angelHP);
    }
}
