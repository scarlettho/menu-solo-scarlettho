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
        
        currentAvatar = avatars.peek();
        setBackground(currentAvatar);
        
        addObject(new Button("Instructions", this::goInstructions, "buttonLong_blue.png"), 300, 340);
        addObject(new Button("Next Avatar", this::cycleAvatar, "buttonLong_blue.png"), 300, 300);
    }

    public void goInstructions() {
        screenHistory.push(this);  // Push current screen to the stack before switching
        Greenfoot.setWorld(new InstructionScreen(this));
    }

    public void cycleAvatar() {
        AvatarManager avatarManager = new AvatarManager(this); // Pass MenuScreen reference
        addObject(avatarManager, getWidth() / 2, getHeight() / 2); // Position it as needed
    }
}