import greenfoot.*;
import java.util.Queue;
import java.util.LinkedList;

public class MenuScreen extends World {
    private Queue<GreenfootImage> avatars;
    private GreenfootImage currentAvatar;

    public MenuScreen() {
        super(600, 400, 1);
        
        // Add the "Go to Instructions" button
        addObject(new Button("Instructions", this::goInstructions), 300, 340);
        
        // Initialize the avatar queue
        avatars = new LinkedList<>();
        avatars.add(new GreenfootImage("face_a.png"));
        avatars.add(new GreenfootImage("face_b.png"));
        avatars.add(new GreenfootImage("face_c.png"));
        
        currentAvatar = avatars.peek();
        setBackground(currentAvatar);
        
        // Add the "Next Avatar" button
        addObject(new Button("Next Avatar", this::cycleAvatar), 300, 300);
    }

    public void goInstructions() {
        Greenfoot.setWorld(new InstructionScreen(this));
    }

    public void cycleAvatar() {
        avatars.add(avatars.remove());  // Rotate the avatars in the queue
        currentAvatar = avatars.peek();
        setBackground(currentAvatar);  // Update the background with the new avatar
    }
}