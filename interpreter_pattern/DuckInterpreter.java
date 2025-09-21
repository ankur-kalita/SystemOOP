package interpreter_pattern;

public class DuckInterpreter {
    private Duck duck;
    
    public DuckInterpreter(Duck duck) {
        this.duck = duck;
    }
    
    public void interpret(String command) {
        Command cmd = parseCommand(command);
        if (cmd != null) {
            cmd.execute(duck);
        } else {
            System.out.println("Unknown command: " + command);
        }
    }
    
    private Command parseCommand(String command) {
        switch (command.toLowerCase()) {
            case "fly":
                return new FlyCommand();
            case "quack":
                return new QuackCommand();
            case "moveright":
                return new MoveRightCommand();
            default:
                return null;
        }
    }
}
