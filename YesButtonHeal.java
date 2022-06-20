import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A yes button when NPC 2 asks if you want to heal
 * 
 * @author Jonathan Zhao 
 * @version June 2
 */
public class YesButtonHeal extends Actor
{
    public static boolean hasCheckpoint = false;
    
    public static void resetStatic()
    {
        hasCheckpoint = false;
    }
    
    public static int savePotions;
    public static int saveKnives;
    public static int saveWallet;
    public static boolean saveGoblet;
    public static boolean saveSpear;
    public static boolean saveTome;
    public static boolean savePlacedGoblet;
    public static boolean savePlacedSpear;
    public static boolean savePlacedTome;
    public void act()
    {
        if(Greenfoot.mouseMoved(this))
        {
            setImage("images/CharacterText/YesButton2.png");
        }
        if(Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this))
        {
            setImage("images/CharacterText/YesButton1.png");
        }
        if(Greenfoot.mouseClicked(this))
        {
            World2Ver4 world = (World2Ver4) getWorld();
            MainCharacterFighting.mainCharacterHP = 100;
            Greenfoot.setWorld(new World2Ver4(getWorld()));
            MainCharacter.canMove = true;
            Greenfoot.playSound("Rest.wav");
            
            // Saves the character's loadout
            savePotions = Potion.numberPotions;
            saveKnives = ThrowingKnife.numberKnives;
            saveWallet = Wallet.wallet;
            saveGoblet = GobletOfYabba.hasGoblet;
            saveSpear = SpearOfKulbally.hasSpear;
            saveTome = TomeOfRebaer.hasTome;
            savePlacedGoblet = GobletOfYabba.placedGoblet;
            savePlacedSpear = SpearOfKulbally.placedSpear;
            savePlacedTome = TomeOfRebaer.placedTome;
            hasCheckpoint = true;

        }
    }
}
