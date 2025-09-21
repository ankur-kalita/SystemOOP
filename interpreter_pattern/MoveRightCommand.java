package interpreter_pattern;

public class MoveRightCommand implements Command {
    @Override
    public void execute(Duck duck) {
        duck.moveRight();
    }
}
