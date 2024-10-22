import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * A Label class that allows you to display a textual value on screen.
 * 
 * The Label is an actor, so you will need to create it, and then add it to the world
 * in Greenfoot.  If you keep a reference to the Label then you can change the text it
 * displays.  
 *
 * @author Amjad Altadmri 
 * @version 1.1
 */
public class Label extends Actor
{
    private GreenfootImage image;
    private String text;
    private int fontSize;
    
    /**
     * Create a new label, initialise it with the needed text and the font size 
     */
    public Label(String value, int fontSize)
    {
        this.text = value;
        this.fontSize = fontSize;
        updateImage();
    }

    /**
     * Sets the value  as text
     * 
     * @param value the text to be show
     */
    public void setValue(String text)
    {
        this.text = text;
        updateImage();
    }
    
    /**
     * Update the image on screen to show the current value.
     */
    private void updateImage()
    {
        if (text != null && !text.isEmpty()) {
            image = new GreenfootImage(text, fontSize, Color.BLACK, Color.WHITE);
            setImage(image);
        }
    }
}