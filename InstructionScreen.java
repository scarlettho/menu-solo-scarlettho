import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Stack;

public class InstructionScreen extends World
{
    private String[] instructions;
    private MenuScreen menu;
    private int index;
    private Label label;
    private Stack<World> screenHistory;  // Stack to keep track of screen history
    public InstructionScreen(MenuScreen menu)
    {
        super(600, 400, 1);
        this.menu = menu;
        this.screenHistory = new Stack(); // store screen history
        
        screenHistory.push(menu);
        
        instructions = new String[]{"Click <Next Avatar> to see more!","Click <High Score> to view your high score!", "Click <Back to Menu> to exit!"}; 
        index = 0;
        
        label = new Label(instructions[index], 30);
        addObject(label, 300, 200);
        buttons();
    }
    public void buttons()
    {
        Button nextButton = new Button("Next", this::nextInstruction, "buttonLong_blue.png");
        addObject(nextButton, 500, 340);  // Only x and y
    
        Button prevButton = new Button("Previous", this::previousInstruction, "buttonLong_blue.png");
        addObject(prevButton, 100, 340);
        
        Button backButton = new Button("Back to Menu", this::goBack, "buttonLong_blue.png");
        addObject(backButton, 300, 340);
    }
    public void nextInstruction() 
    {
        if (index < instructions.length - 1)
        {
            index++;
            label.setValue(instructions[index]);
        }
    }
    public void previousInstruction()
    {
        if (index > 0)
        {
            index--;
            label.setValue(instructions[index]);
        }
    }
    public void goBack()
    {
        if(!screenHistory.isEmpty())
        {
            World previousScreen = screenHistory.pop(); // Get the last screen
            Greenfoot.setWorld(previousScreen); // Switch to the previous screen
        }
    }
}
