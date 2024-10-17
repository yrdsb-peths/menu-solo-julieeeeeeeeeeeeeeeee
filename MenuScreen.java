import greenfoot.*;

public class MenuScreen extends World {
    private Queue<Avatar> avatars = new Queue(); 
    private Avatar current = new Avatar("images/face_a.png");

    public MenuScreen() 
    {
        super(600, 400, 1);
        
        addObject(new Button(this::goInstructions), 300, 340);
        addObject(new Button(this::goAvatar), 300, 225); 
        addObject(current, 300, 100); 
    }

    public void goInstructions()
    {
        Greenfoot.setWorld(new InstructionScreen());
    }

    public void goAvatar()
    {        
        avatars.enqueue(new Avatar("images/face_a.png"));
        avatars.enqueue(new Avatar("images/face_b.png"));
        avatars.enqueue(new Avatar("images/face_c.png"));

        avatars.enqueue(current);
        removeObject(current);
        current = avatars.dequeue(); 
        addObject(current, 300, 100);
    }
}
