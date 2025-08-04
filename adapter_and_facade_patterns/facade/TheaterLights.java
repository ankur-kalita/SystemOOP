package adapter_and_facade_patterns.facade;

public class TheaterLights {
    String description;

    public TheaterLights(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " is now ON");
    }

    public void off() {
        System.out.println(description + " is now OFF");
    }

    public void dim(int level) {
        System.out.println(description + " dimming to " + level + "%");
    }

    @Override
    public String toString() {
        return description;
    }
}
