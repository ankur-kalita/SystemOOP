package adapter_and_facade_patterns.facade;

public class StreamingPlayer {
    String description;
    String movie;

    public StreamingPlayer(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " is now ON");
    }

    public void off() {
        System.out.println(description + " is now OFF");
    }

    public void play(String movie) {
        this.movie = movie;
        System.out.println(description + " playing \"" + movie + "\"");
    }

    public void stop() {
        System.out.println(description + " stopped \"" + movie + "\"");
        this.movie = null;
    }

    @Override
    public String toString() {
        return description;
    }
}
