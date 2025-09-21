package mediator_pattern;

public class main {
    public static void main(String[] args) {
        // Create mediator
        ChatRoom chatRoom = new ChatRoom();
        
        // Create users
        User alice = new User("Alice", chatRoom);
        User bob = new User("Bob", chatRoom);
        User charlie = new User("Charlie", chatRoom);
        
        // Add users to chat room
        chatRoom.addUser(alice);
        chatRoom.addUser(bob);
        chatRoom.addUser(charlie);
        
        // Send messages
        alice.send("Hello everyone!");
        bob.send("Hi Alice!");
        charlie.send("Good morning all!");
    }
}
