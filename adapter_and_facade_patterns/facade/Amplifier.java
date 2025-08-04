package adapter_and_facade_patterns.facade;

public class Amplifier {
    String description;
    Tune tuner;
    StreamingPlayer player;

    public Amplifier(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " is now ON");
    }

    public void off() {
        System.out.println(description + " is now OFF");
    }

    public void setTuner(Tune tuner) {
        this.tuner = tuner;
        System.out.println(description + " setting tuner to " + tuner);
    }

    public void setStreamingPlayer(StreamingPlayer player) {
        this.player = player;
        System.out.println(description + " setting streaming player to " + player);
    }

    public void setVolume(int level) {
        System.out.println(description + " setting volume to " + level);
    }

    public void setSurroundSound() {
        System.out.println(description + " setting surround sound");
    }

    @Override
    public String toString() {
        return description;
    }
}
