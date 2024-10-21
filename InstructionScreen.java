import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Stack;

public class InstructionScreen extends World
{
    private String[] instructions;
    private MenuScreen menu;
    private int index;
    private Label label;
    private Stack<World> screenHistory;
    public InstructionScreen(MenuScreen menu, Stack<World> screenHistory)
    {
        super(600, 400, 1);
        this.menu = menu;
        this.screenHistory = screenHistory;
        instructions = new String[]{"Welcome to the game!","Use arrow keys to move.", "Press space to jump."}; 
        index = 0;
        
        label = new Label(instructions[index], 30);
        addObject(label, 300, 200);
        buttons();
    }
    public void buttons()
    {
        Button nextButton = new Button("Next", this::nextInstruction, "buttonLong_blue.png");
        addObject(nextButton, getWidth() / 2 + 100, getHeight() - 50);  // Only x and y
    
        Button prevButton = new Button("Previous", this::previousInstruction, "buttonLong_blue.png");
        addObject(prevButton, getWidth() / 2 - 100, getHeight() - 50);
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
    public void switchScreen(World newScreen)
    {
        screenHistory.push(this);
        Greenfoot.setWorld(newScreen);
    }
}
