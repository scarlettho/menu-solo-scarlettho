import greenfoot.*;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class MenuScreen extends World {
    private Queue<GreenfootImage> avatars;
    private GreenfootImage currentAvatar;
    private Stack<World> screenHistory;  // Stack to track screen history

    public MenuScreen() {
        super(600, 400, 1);
        
        screenHistory = new Stack<>();  // Initialize the stack
        
        // Add the "Go to Instructions" button
        addObject(new Button("Instructions", this::goInstructions, "buttonLong_blue.png"), 300, 340);
        
        // Initialize the avatar queue
        avatars = new LinkedList<>();
        avatars.add(new GreenfootImage("face_a.png"));
        avatars.add(new GreenfootImage("face_b.png"));
        avatars.add(new GreenfootImage("face_c.png"));
        
        currentAvatar = avatars.peek();
        setBackground(currentAvatar);
        
        // Add the "Next Avatar" button
        addObject(new Button("Next Avatar", this::cycleAvatar, "buttonLong_blue.png"), 300, 300);
    }

    public void goInstructions() {
        screenHistory.push(this);  // Push current screen to the stack before switching
        Greenfoot.setWorld(new InstructionScreen(this, screenHistory));
    }

    public void cycleAvatar() {
        avatars.add(avatars.remove());  // Rotate the avatars in the queue
        currentAvatar = avatars.peek();
        setBackground(currentAvatar);  // Update the background with the new avatar
    }
}