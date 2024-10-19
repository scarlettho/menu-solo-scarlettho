import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Queue;
import java.util.LinkedList;
public class MenuScreen extends World {
    private Queue<GreenfootImage> avatars;
    private GreenfootImage currentAvatar;
    public MenuScreen() {
        super(600, 400, 1);
        addObject(new Button(this::goInstructions), 300, 340);
        avatars = new LinkedList<>();
        avatars.add(new GreenfootImage("face_a.png"));
        avatars.add(new GreenfootImage("face_b.png"));
        avatars.add(new GreenfootImage("face_c.png"));
    }
    public void goInstructions() {
        Greenfoot.setWorld(new InstructionScreen(this));
    }
}
