package adapter_and_facade_patterns.facade;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        
        Amplifier amp = new Amplifier("Top-O-Line Amplifier");
        Tune tuner = new Tune("Top-O-Line Tuner");
        StreamingPlayer player = new StreamingPlayer("Top-O-Line DVD Player");
        Projector projector = new Projector("Top-O-Line Projector", tuner);
        TheaterLights lights = new TheaterLights("Theater Lights");
        Screen screen = new Screen("Theater Screen");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, player, projector, lights, screen, popper);
        homeTheater.watchMovie("Interstellar");
        homeTheater.endMovie();
    }
}
