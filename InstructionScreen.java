import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class InstructionScreen extends World
{
    public InstructionScreen()
    {    
        super(600, 400, 1); 
        
        addObject(new Button(this::goMenuScreen), 150, 340);
        addObject(new Button(this::goAvatar), 450, 340);
    }
    
    public void goMenuScreen()
    {
        Greenfoot.setWorld(new MenuScreen());
    }
    
    public void goAvatar()
    {
        Greenfoot.setWorld(new AvatarScreen());
    }
}
