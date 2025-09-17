package compound_pattern.simple;

public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
