package singleton_pattern;

public class BoilerClient {
    public static void main(String[] args) {
        ChocolateBoiler boiler = ChocolateBoiler.INSTANCE;

        boiler.fill();
        System.out.println("Boiler filled: " + !boiler.isEmpty());
        boiler.boil();
        System.out.println("Boiler boiled: " + boiler.isBoiled());
        boiler.drain();
        System.out.println("Boiler drained: " + boiler.isEmpty());
    }
}
