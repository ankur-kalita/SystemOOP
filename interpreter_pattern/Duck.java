package interpreter_pattern;

public class Duck {
    private int position = 0;
    
    public void fly() {
        System.out.println("Duck is flying!");
    }
    
    public void quack() {
        System.out.println("Quack!");
    }
    
    public void moveRight() {
        position++;
        System.out.println("Duck moved right to position: " + position);
    }
    
    public int getPosition() {
        return position;
    }
}
