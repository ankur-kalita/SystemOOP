package memento_pattern;

public class TextSnapshot {
    private final String text;
    
    public TextSnapshot(String text) {
        this.text = text;
    }
    
    public String getText() {
        return text;
    }
}
