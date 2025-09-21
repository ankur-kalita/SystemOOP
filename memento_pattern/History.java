package memento_pattern;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<TextSnapshot> snapshots;
    
    public History() {
        this.snapshots = new ArrayList<>();
    }
    
    public void save(TextSnapshot snapshot) {
        snapshots.add(snapshot);
    }
    
    public TextSnapshot undo() {
        if (!snapshots.isEmpty()) {
            return snapshots.remove(snapshots.size() - 1);
        }
        return null;
    }
}
