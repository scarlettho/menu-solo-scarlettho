import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Button extends Actor {
    private Runnable action;
    private String label;
    // Constructor: the label comes first, then the action
    public Button(String label, Runnable action, String imageFile) {
        this.action = action;
        this.label = label;
        
        // Set the button image
        GreenfootImage image = new GreenfootImage("images/buttonLong_beige.png");
        image.setColor(Color.BLACK);
        image.setFont(new Font("Arial", true, false, 20));
        
        // Draw the label on the button
        image.drawString(label, image.getWidth() / 2 - 50, image.getHeight() / 2);
        setImage(image); 
    }

    // Detect mouse click and perform action
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            if(action != null)
            {
                action.run();  // Trigger the action passed in the constructor
            }
        }
    }
}

