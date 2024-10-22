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
        highScore = new HashMap<>();
        highScore.put("Glizzy", 2000);
        highScore.put("Alice", 1000);
        highScore.put("Melody", 4000);
        int yPosition = 100; // Starting y position for the first entry
        for(Map.Entry<String, Integer> entry : highScore.entrySet())
        {
            String displayText = entry.getKey();
            int score = entry.getValue();
            
            Label scoreLabel = new Label(displayText + ": " + score, 30);
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
