package compound_pattern.simple;

// Decorator pattern is used to add additional behavior to objects

public class QuackCounter implements Quackable {
    Quackable duck;
    static int numberOfQuacks; // shared across all instances, if not static, each instance will have its own count

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    public static int getQuacks() {
        return numberOfQuacks;
    }

    @Override
    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        duck.notifyObservers();
    }
    
}
