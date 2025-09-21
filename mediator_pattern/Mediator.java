package mediator_pattern;

public interface Mediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}
