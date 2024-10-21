import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.LinkedList;

public class AvatarManager extends Actor
{
    private LinkedList<Avatar> avatars = new LinkedList<>();
    private Avatar current;
    public AvatarManager()
    {
        //puting avatar images to queue
        avatars.add(new Avatar("face_a.png"));
        avatars.add(new Avatar("face_b.png"));
        avatars.add(new Avatar("face_c.png"));
        
        current = avatars.remove();
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