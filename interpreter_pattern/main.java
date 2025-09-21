package interpreter_pattern;

public class main {
    public static void main(String[] args) {
        Duck duck = new Duck();
        DuckInterpreter interpreter = new DuckInterpreter(duck);
        
        System.out.println("=== Duck Interpreter Pattern Demo ===");
        
        // Interpret various commands
        interpreter.interpret("quack");
        interpreter.interpret("fly");
        interpreter.interpret("moveright");
        interpreter.interpret("moveright");
        interpreter.interpret("quack");
        interpreter.interpret("invalid");
        
        System.out.println("Final duck position: " + duck.getPosition());
    }
}
