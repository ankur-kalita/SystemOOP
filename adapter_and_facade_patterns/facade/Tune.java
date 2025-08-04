package adapter_and_facade_patterns.facade;

public class Tune {
    String description;
    double frequency;

    public Tune(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " is now ON");
    }

    public void off() {
        System.out.println(description + " is now OFF");
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
        System.out.println(description + " setting frequency to " + frequency);
    }

    @Override
    public String toString() {
        return description;
    }
}
