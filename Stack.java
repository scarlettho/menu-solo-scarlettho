import greenfoot.World;
import java.util.List;
import java.util.ArrayList;

public class Stack {
    private List<World> stack;

    public Stack()
    {
        stack = new ArrayList<>();
    }
    public void push(World screen)
    {
        stack.add(screen);
    }
    public World pop()
    {
        if(!stack.isEmpty())
        {
            return stack.remove(stack.size() - 1);
        }
        return null;
    }
    public World peek()
    {
        if(!stack.isEmpty())
        {
            return stack.get(stack.size() - 1);
        }
        return null;
    }
    public boolean isEmpty()
    {
        return stack.isEmpty();
    }
    public int size()
    {
        return stack.size();
    }
}
