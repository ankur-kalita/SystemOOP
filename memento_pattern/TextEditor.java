package memento_pattern;

public class TextEditor {
    private String text;
    
    public TextEditor() {
        this.text = "";
    }
    
    public void write(String text) {
        this.text += text;
    }
    
    public String getText() {
        return text;
    }
    
    public TextSnapshot save() {
        return new TextSnapshot(text);
    }
    
    public void restore(TextSnapshot snapshot) {
        this.text = snapshot.getText();
    }
}
