package interpreter_pattern;

public class FlyCommand implements Command {
    @Override
    public void execute(Duck duck) {
        duck.fly();
    }
}
