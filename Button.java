import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Button extends Actor {
    private Runnable action;

    // Constructor: the label comes first, then the action
    public Button(String label, Runnable action) {
        this.action = action;
        
        // Set the button image
        GreenfootImage image = new GreenfootImage("images/buttonLong_beige.png");
        image.setColor(Color.BLACK);
        image.setFont(new Font(20));
        
        // Draw the label on the button
        image.drawString(label, image.getWidth() / 3, image.getHeight() / 2 + 5);
        setImage(image); 
    }

    // Detect mouse click and perform action
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            action.run();  // Trigger the action passed in the constructor
        }
    }
}

