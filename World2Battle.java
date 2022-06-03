import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The actual battle occurs here in world 2
 * 
 * @author Jonathan Zhao
 * @version June 1
 */
public class World2Battle extends World
{
    Label mainCharacterHPLabel = new Label("HP: " + MainCharacterFighting.mainCharacterHP, 50);
    Label tutorialHPLabel = new Label("HP: " + TutorialNPC2Fighting.tutorialHP, 50);
    public World2Battle()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        
        // Create the main character
        MainCharacterFighting mainCharacterFighting = new MainCharacterFighting();
        addObject(mainCharacterFighting, 200, 650);
        
        // Create enemy's hp
        addObject(tutorialHPLabel, 1100, 60);
        
        // Create the enemy
        TutorialNPC2Fighting tutorialNPC2Fighting = new TutorialNPC2Fighting();
        addObject(tutorialNPC2Fighting, 800, 500);
        
        // Create main character's hp
        addObject(mainCharacterHPLabel, 100, 60);
        
        // Create the fight button
        FightButtonTutorial fightButtonTutorial = new FightButtonTutorial();
        addObject(fightButtonTutorial, 400, 750);
        
        // Create the bag button
        FightingBagButton fightingBagButton = new FightingBagButton();
        addObject(fightingBagButton, 800, 750);
        
        
    }
    
    public void act()
    {
        mainCharacterHPLabel.setValue("HP: " + MainCharacterFighting.mainCharacterHP);
        tutorialHPLabel.setValue("HP: " + TutorialNPC2Fighting.tutorialHP);
    }
    
    
}
