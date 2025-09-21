package chain_of_responsibility_pattern;

class FileLogger extends Logger {
    public FileLogger(int level) {
        this.level = level;
    }
    protected void write(String message) {
        System.out.println("File Logger: " + message);
    }
}