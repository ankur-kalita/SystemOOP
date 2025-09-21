package interpreter_pattern;

public class QuackCommand implements Command {
    @Override
    public void execute(Duck duck) {
        duck.quack();
    }
}
