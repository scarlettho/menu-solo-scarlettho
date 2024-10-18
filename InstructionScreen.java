import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class InstructionScreen extends World
{
    private MenuScreen menu;
    private String[] instructions;
    private int index;
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
    }
}
