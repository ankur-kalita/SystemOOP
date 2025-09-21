package chain_of_responsibility_pattern;

class ErrorLogger extends Logger {
    public ErrorLogger(int level) {
        this.level = level;
    }
    protected void write(String message) {
        System.out.println("Error Logger: " + message);
    }
}