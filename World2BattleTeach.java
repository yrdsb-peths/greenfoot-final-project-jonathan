import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The battlefield. Text will show up here in order
 * to teach the player how to fight.
 * 
 * @author Jonathan Zhao
 * @version June 1
 */
public class World2BattleTeach extends World
{
    Label mainCharacterHPLabel = new Label(MainCharacterFighting.mainCharacterHP, 50);
    Label tutorialHPLabel = new Label(TutorialNPC2Fighting.tutorialHP, 50);
    public World2BattleTeach()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        
        // Create the main character
        MainCharacterFighting mainCharacterFighting = new MainCharacterFighting();
        addObject(mainCharacterFighting, 200, 650);
        
        // Create the enemy
        TutorialNPC2Teaching tutorialNPC2Teaching = new TutorialNPC2Teaching();
        addObject(tutorialNPC2Teaching, 800, 500);
        
        // Create main character's hp
        addObject(mainCharacterHPLabel, 100, 40);
        
        // Create enemy's hp
        addObject(tutorialHPLabel, 1100, 40);
    }
}
