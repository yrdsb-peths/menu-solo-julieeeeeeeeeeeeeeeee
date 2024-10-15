import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class InstructionScreen extends World
{
    public InstructionScreen()
    {    
        super(600, 400, 1); 
        
        addObject(new Button(this::goMenuScreen), 150, 340);
        addObject(new Button(this::goInstruction2), 450, 340);
        
        Label instruction1 = new Label("Instructions 1", 60);
        addObject(instruction1, 300, 200);
    }
    
    public void goMenuScreen()
    {
        Greenfoot.setWorld(new MenuScreen());
    }
    
    public void goInstruction2()
    {
        Greenfoot.setWorld(new InstructionScreen2());
    }
}
