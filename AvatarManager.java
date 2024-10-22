import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.LinkedList;

public class AvatarManager extends Actor
{
    private LinkedList<GreenfootImage> avatarImages = new LinkedList<>();
    private GreenfootImage currentAvatarImage;
    
    public AvatarManager()
    {
        // Putting avatar images to LinkedList
        avatarImages.add(new GreenfootImage("face_a.png"));
        avatarImages.add(new GreenfootImage("face_b.png"));
        avatarImages.add(new GreenfootImage("face_c.png"));
        
        currentAvatarImage = avatarImages.peek(); // Get the first avatar without removing it
        setImage(currentAvatarImage);
    }
    
    @Override
    protected void addedToWorld(World world)
    {
        world.addObject(new Button("Next Avatar", this::next, "buttonLong_beige.png"), world.getWidth() / 2, world.getHeight() - 50);
        setImage(currentAvatarImage); // Set the initial avatar image
    }
    
    // Method to change the current avatar
    public void next()
    {
        avatarImages.add(avatarImages.remove()); // Rotate the avatars in the list
        currentAvatarImage = avatarImages.peek(); // Peek at the next avatar without removing
        setImage(currentAvatarImage); // Update the image to the new avatar
    }
}