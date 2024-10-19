import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class InstructionScreen extends World
{
    private MenuScreen menu;
    private String[] instructions;
    private int index;
    private Label labelInstruction;
    public InstructionScreen(MenuScreen menu)
    {
        super(600, 400, 1);
        this.menu = menu;
        instructions = new String[]
        {
            "Welcome to the game!",
            "Use arrow keys to move.",
            "Press space to jump."
        };
        index = 0;
        
        labelInstruction = new Label(instructions[index], 30);
        addObject(labelInstruction, 300, 200);
    }
    public void nextInstruction() 
    {
        if (index < instructions.length - 1)
        {
            index++;
            labelInstruction.setValue(instructions[index]);
        }
    }
    public void previousInstruction()
    {
        if (index > 0)
        {
            index--;
            labelInstruction.setValue(instructions[index]);
        }
    }
}
