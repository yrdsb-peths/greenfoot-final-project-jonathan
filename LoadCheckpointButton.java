import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Button that loads checkpoint upon death.
 * Brings player back to the second tutorial NPC after their last heal
 * Doesn't let player load if they didn't make a save
 * 
 * @author Jonathan Zhao
 * @version June 12
 */
public class LoadCheckpointButton extends Actor
{
    public void act()
    {
        if(Greenfoot.mouseMoved(this))
        {
            setImage("images/CharacterText/LoadButton2.png");
        }
        if(Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this))
        {
            setImage("images/CharacterText/LoadButton1.png");
        }
        if(Greenfoot.mouseClicked(this))
        {
            // Load conditions at save
            MainCharacterFighting.mainCharacterHP = 100;
            MainCharacter.resetStatic();
            Greenfoot.setWorld(new World2Ver4(getWorld()));
            ThrowingKnife.numberKnives = YesButtonHeal.saveKnives;
            Potion.numberPotions = YesButtonHeal.savePotions;
            Wallet.wallet = YesButtonHeal.saveWallet;
            GobletOfYabba.hasGoblet = YesButtonHeal.saveGoblet;
            SpearOfKulbally.hasSpear = YesButtonHeal.saveSpear;
            TomeOfRebaer.hasTome = YesButtonHeal.saveTome;
            GobletOfYabba.placedGoblet = YesButtonHeal.savePlacedGoblet;
            SpearOfKulbally.placedSpear = YesButtonHeal.savePlacedSpear;
            TomeOfRebaer.placedTome = YesButtonHeal.savePlacedTome;
            
            // reset enemy status
            TheRedsFighting.resetStatic();
            TheReds.resetStatic();
            BigRedFighting.resetStatic();

        }
    }
}
