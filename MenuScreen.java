import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Queue;
import java.util.LinkedList;
public class MenuScreen extends World
{
    private Queue<GreenfootImage> avatars;
    private GreenfootImage currentAvatar;
    public MenuScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
}
