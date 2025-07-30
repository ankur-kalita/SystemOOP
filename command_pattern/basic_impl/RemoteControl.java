package command_pattern.basic_impl;

class RemoteControl {
    Command slot;

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void pressButton() {
        slot.execute();
    }
}