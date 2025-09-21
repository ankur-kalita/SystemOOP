package memento_pattern;

public class main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        History history = new History();
        
        // Write some text
        editor.write("Hello ");
        System.out.println("Current text: " + editor.getText());
        
        // Save state
        history.save(editor.save());
        
        // Write more text
        editor.write("World!");
        System.out.println("Current text: " + editor.getText());
        
        // Save state again
        history.save(editor.save());
        
        // Write more text
        editor.write(" How are you?");
        System.out.println("Current text: " + editor.getText());
        
        // Undo to previous state
        TextSnapshot snapshot = history.undo();
        if (snapshot != null) {
            editor.restore(snapshot);
            System.out.println("After undo: " + editor.getText());
        }
        
        // Undo again
        snapshot = history.undo();
        if (snapshot != null) {
            editor.restore(snapshot);
            System.out.println("After second undo: " + editor.getText());
        }
    }
}
