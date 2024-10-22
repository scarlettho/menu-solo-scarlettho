import java.util.LinkedList;

public class Queue {
    private LinkedList<String> avatar;
    private Node first;
    private Node last;
    private int size;
    public class Node
    {
        String avatar;
        Node next;
        
        public Node(String avatar)
        {
            this.avatar = avatar;
        }
    }
    public Queue() {
        first = null;
        last = null;
        size = 0;
    }
    public void enqueue(String avatar) {
        Node newNode = new Node(avatar);
        if(last != null)
        {
            last.next = newNode;
        }
        last = newNode;
        if(first == null)
        {
            first = last;
        }
        size++;
    }
    public String dequeue() {
        if (first == null) {
            return null; // or throw an exception
        }
        String removedAvatar = first.avatar;
        first = first.next;
        if (first == null) {
            last = null; // If the queue becomes empty
        }
        size--;
        return removedAvatar;
    }
    public String peek() {
        if (first == null) {
            return null;
        }
        return first.avatar;
    }
    public int size() {
        return size();
    }
    public boolean isEmpty() {
        return size == 0;
    }
}