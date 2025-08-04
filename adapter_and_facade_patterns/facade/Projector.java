package adapter_and_facade_patterns.facade;

public class Projector {
    String description;
    Tune tuner;

    public Projector(String description, Tune tuner) {
        this.description = description;
        this.tuner = tuner;
    }

    public void on() {
        System.out.println(description + " is now ON");
    }

    public void off() {
        System.out.println(description + " is now OFF");
    }

    public void wideScreenMode() {
        System.out.println(description + " in wide screen mode");
    }

    @Override
    public String toString() {
        return description;
    }
}
