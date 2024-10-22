import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.HashMap;
import java.util.Map;

public class HighScore extends World
{
    private Map<String, Integer> highScore;
    /**
     * Constructor for objects of class HighScore.
     * 
     */
    public HighScore()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        displayHighScore();
        addBackButton();
    }
    private void displayHighScore()
    {
        Map<String, Integer> highScore = new HashMap<>();
        highScore.put("Hannah", 100);
        highScore.put("Alice", 80);
        highScore.put("Melody", 50);
        int yPosition = 50; // Starting y position for the first entry
        for(Map.Entry<String, Integer> entry : highScore.entrySet())
        {
            String displayText = entry.getKey() + ": " + entry.getValue();
            Label scoreLabel = new Label(displayText, 30);
            addObject(scoreLabel, getWidth() / 2, yPosition);
            yPosition += 50; // Increase y position for the next entry
        }
    }
    public void addBackButton()
    {
        Button backButton = new Button("Back to Menu", this::goBack, "buttonLong_blue.png");
        addObject(backButton, getWidth() / 2, getHeight() - 50);
    }
    public void goBack()
    {
        Greenfoot.setWorld(new MenuScreen());
    }
}
