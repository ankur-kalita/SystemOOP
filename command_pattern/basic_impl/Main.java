package command_pattern.basic_impl;

public class Main {
    public static void main(String[] args) {
        // Receiver
        Light light = new Light();

        // Commands
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        // Invoker
        RemoteControl remote = new RemoteControl();

        // Client sets a command
        remote.setCommand(lightOn);
        remote.pressButton();  // Output: 💡 Light is ON

        remote.setCommand(lightOff);
        remote.pressButton();  // Output: 💡 Light is OFF
    }
}
