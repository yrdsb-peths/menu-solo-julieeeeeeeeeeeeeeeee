import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class InstructionScreen2 extends World
{
    public InstructionScreen2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        addObject(new Button(this::goInstruction), 150, 340); 
        
        Label instruction2 = new Label("Instruction 2", 60);
        addObject(instruction2, 300, 200); 
    }
    
    public void goInstruction()
    {
        Greenfoot.setWorld(new InstructionScreen()); 
    }
}
