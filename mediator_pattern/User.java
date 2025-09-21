package mediator_pattern;

public class User {
    private String name;
    private Mediator mediator;
    
    public User(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
    
    public String getName() {
        return name;
    }
    
    public void send(String message) {
        System.out.println(name + " sends: " + message);
        mediator.sendMessage(message, this);
    }
    
    public void receive(String message, String senderName) {
        System.out.println(name + " received from " + senderName + ": " + message);
    }
}
