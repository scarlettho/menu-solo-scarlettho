import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class InstructionScreen extends World
{
    private String[] instructions;
    private int index;
    private Label label;
    public InstructionScreen(MenuScreen menu)
    {
        super(600, 400, 1);
        instructions = new String[]{"Welcome to the game!","Use arrow keys to move.", "Press space to jump."}; 
        index = 0;
        
        label = new Label(instructions[index], 30);
        addObject(label, 300, 200);
        buttons();
    }
    public void buttons()
    {
        Button nextButton = new Button("Next", this::nextInstruction);
        addObject(nextButton, getWidth()/2, + 100, getHeight() - 50);
        
        Button prevButton = new Button("Previous", this::previousInstruction);
        addObject(prevButton, getWidth()/2, - 100, getHeight() - 50);
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(getObjects(Button.class).get(0)))
        {
            nextInstruction();
        }
        if(Greenfoot.mouseClicked(getObjects(Button.class).get(0)))
        {
            previousInstruction();
        }
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
}
