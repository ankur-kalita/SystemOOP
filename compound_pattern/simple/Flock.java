package compound_pattern.simple;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Composite pattern allows us to treat a group of objects in the same way as an individual object.

public class Flock implements Quackable {
    List<Quackable> quackers = new ArrayList<Quackable>();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        Iterator<Quackable> iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = iterator.next();
            quacker.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        Iterator<Quackable> iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = iterator.next();
            quacker.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {}
    
}
