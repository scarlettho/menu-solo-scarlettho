import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.LinkedList;

public class AvatarManager extends Actor
{
    private LinkedList<GreenfootImage> avatarImages = new LinkedList<>();
    private GreenfootImage currentAvatarImage;
    private MenuScreen menu;  // Reference to the MenuScreen
    
    public AvatarManager(MenuScreen menu)
    {
        this.menu = menu;
        // Putting avatar images to LinkedList
        avatarImages.add(new GreenfootImage("face_a.png"));
        avatarImages.add(new GreenfootImage("face_b.png"));
        avatarImages.add(new GreenfootImage("face_c.png"));
        
        currentAvatarImage = avatarImages.peek(); // Get the first avatar without removing it
    }
    
    @Override
    protected void addedToWorld(World world)
    {
        world.addObject(new Button("Next Avatar", this::next, "buttonLong_beige.png"), world.getWidth() / 2, world.getHeight() - 50);
        setImage(currentAvatarImage); // Set the initial avatar image
        
        // Add a back button to return to the menu
        world.addObject(new Button("Back to Menu", this::goBack, "buttonLong_beige.png"), world.getWidth() / 2, world.getHeight() - 100);
    }
    
    // Method to change the current avatar
    public void next()
    {
        avatarImages.add(avatarImages.remove()); // Rotate the avatars in the list
        currentAvatarImage = avatarImages.peek(); // Peek at the next avatar without removing
        setImage(currentAvatarImage); // Update the image to the new avatar
    }
    
    // Go back to the MenuScreen
    public void goBack() {
        Greenfoot.setWorld(menu); // Switch back to the MenuScreen
    }
}