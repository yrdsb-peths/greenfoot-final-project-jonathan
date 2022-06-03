import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The button to buy The Tome of Rebaer
 * 
 * @author Jonathan Zhao 
 * @version June 3
 */
public class BuyTomeButton extends Actor
{
    public void act()
    {
        if(Greenfoot.mouseMoved(this))
        {
            setImage("images/CharacterText/Buy2.png");
        }
        if(Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this))
        {
            setImage("images/CharacterText/Buy1.png");
        }
        if(Greenfoot.mouseClicked(this))
        {
            if(Wallet.wallet - 100 < 0)
            {
                TheShop world = (TheShop) getWorld();
                Text text47 = new Text(47);
                world.addObject(text47, 600, 400);
                BuyOkButton okButton = new BuyOkButton();
                world.addObject(okButton, 900, 450);
            }
            
            else
            {
                TomeOfRebaer.hasTome = true;
                Wallet.wallet -= 100;
                
                Text text48 = new Text(48);
                Text text49 = new Text(49);
                Text text51 = new Text(51);
                Text text54 = new Text(54);
                Text text52 = new Text(52);
                Text text55 = new Text(55);
                Text text56 = new Text(56);
                if(ShopGoblet.firstHolyRelic)
                {
                    TheShop world = (TheShop) getWorld();
                    world.addObject(text48, 600, 400);
                    if(Greenfoot.mouseClicked(text48))
                    {
                        world.addObject(text49, 600, 400);
                    }
                    if(Greenfoot.mouseClicked(text49))
                    {
                        world.addObject(text54, 600, 400);
                    }
                    if(Greenfoot.mouseClicked(text54))
                    {
                        world.addObject(text51, 600, 400);
                    }
                    if(Greenfoot.mouseClicked(text51))
                    {
                        world.addObject(text52, 600, 400);
                    }
                    if(Greenfoot.mouseClicked(text52))
                    {
                        Greenfoot.setWorld(new TheShop(getWorld()));
                        ShopGoblet.firstHolyRelic = false;
                        ShopTome.firstHolyRelic = false;
                        ShopSpear.firstHolyRelic = false;
                    }
                }
                else if(TheShop.lastHolyRelic)
                {
                    TheShop world = (TheShop) getWorld();
                
                    world.addObject(text54, 600, 400);
                
                    if(Greenfoot.mouseClicked(text54))
                    {
                        world.addObject(text51, 600, 400);
                    }
                    if(Greenfoot.mouseClicked(text51))
                    {
                        world.addObject(text55, 600, 400);
                    }
                    if(Greenfoot.mouseClicked(text55))
                    {
                        world.addObject(text56, 600, 400);
                    }
                    if(Greenfoot.mouseClicked(text56))
                    {
                        Greenfoot.setWorld(new TheShop(getWorld()));
                    }
                }
                
                else 
                {
                    TheShop world = (TheShop) getWorld();
                
                    world.addObject(text54, 600, 400);
                
                    if(Greenfoot.mouseClicked(text54))
                    {
                        world.addObject(text51, 600, 400);
                    }
                    if(Greenfoot.mouseClicked(text51))
                    {
                        world.addObject(text52, 600, 400);
                    }
                    if(Greenfoot.mouseClicked(text52))
                    {
                        Greenfoot.setWorld(new TheShop(getWorld()));
                    }
                    
                    TheShop.lastHolyRelic = true;
                }

            }
        }
    }
}
