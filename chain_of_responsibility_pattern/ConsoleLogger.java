package chain_of_responsibility_pattern;

class ConsoleLogger extends Logger {
    public ConsoleLogger(int level) {
        this.level = level;
    }
    protected void write(String message) {
        System.out.println("Console Logger: " + message);
    }
}