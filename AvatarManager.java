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
    
    @Override
    protected void addedToWorld(World world)
    {
        world.addObject(new Button (this::next, "Next Avatar", "buttonLong_beige.png"), world.getWidth() / 2, world.getHeight() - 50);
        updateAvatar();
    }
    
    private void updateAvatar(){
        int x = 300; 
        int y = 100; 
        World world = getWorld();
        if(current != null)
        {
            world.removeObject(current);
        }
        world.addObject(current, x, y);
    }
    
    public void next()
    {
        avatars.add(current);
        current = avatars.remove();
        updateAvatar();
    }
}