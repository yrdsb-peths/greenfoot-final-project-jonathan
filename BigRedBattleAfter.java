import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Immediately after big red is defeated
 * 
 * @author Jonathan Zhao
 * @version June 15
 */
public class BigRedBattleAfter extends World
{
    Label mainCharacterHPLabel = new Label("HP: " + MainCharacterFighting.mainCharacterHP, 50);
    public BigRedBattleAfter()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        
        // Create the main character
        MainCharacterFighting mainCharacterFighting = new MainCharacterFighting();
        addObject(mainCharacterFighting, 200, 650);
        
        // Create the enemy
        BigRedTalking bigRed = new BigRedTalking();
        addObject(bigRed, 800, 500);
        
        // Create main character's hp
        addObject(mainCharacterHPLabel, 100, 60);
    }
    
    public void stopped()
    {
        Soundtrack.fightingMusic.pause();
    }
    
    public void act()
    {
        mainCharacterHPLabel.setValue("HP: " + MainCharacterFighting.mainCharacterHP);
        Soundtrack.fightingMusic.playLoop();
    }
}
