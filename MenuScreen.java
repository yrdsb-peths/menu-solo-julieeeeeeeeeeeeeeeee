import greenfoot.*;

public class MenuScreen extends World {
    public MenuScreen() {
        super(600, 400, 1);
        
        addObject(new Button(this::goInstructions), 300, 340);
        addObject(new Button(this::goAvatar), 300, 225); 
    }
    
    public void goInstructions()
    {
        Greenfoot.setWorld(new InstructionScreen());
    }
    
    public void goAvatar()
    {
        int count = 0;
        Faces a = new Happyface();
        Faces b = new Annoyedface();
        Faces c = new Smilingface(); 
        if(Greenfoot.mouseClicked(this))
        {
            if(count == 0)
            {
                addObject(a, 300, 100);
                count++;
            }
            if(count == 1)
            {
                addObject(b, 300, 100);
                count++; 
            }
            if(count == 2)
            {
                addObject(c, 300, 100);
                count++;
            }
        }
    }
}
