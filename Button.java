import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Button extends Actor {
    private Runnable action;
    public Button(Runnable action, String label) {
        this.action = action;
        GreenfootImage image = new GreenfootImage("images/buttonLong_beige.png");
        setImage(image);
    }

    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            if (action != null) {
                action.run();
            }
        }
    }
}

