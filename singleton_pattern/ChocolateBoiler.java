package singleton_pattern;

// public class ChocolateBoiler {
//     private boolean empty;
//     private boolean boiled;

    // private volatile static ChocolateBoiler uniqueInstance;

    // private ChocolateBoiler() {
    //     empty = true;
    //     boiled = false;
    // }

    // public static ChocolateBoiler getInstance() {
    //     if (uniqueInstance == null) {
    //         synchronized (ChocolateBoiler.class) {
    //             if (uniqueInstance == null) { 
    //                 uniqueInstance = new ChocolateBoiler();
    //             }
    //         }
    //     }
    //     return uniqueInstance;
    // }

public enum ChocolateBoiler {
    INSTANCE;

    private boolean empty;
    private boolean boiled;

    ChocolateBoiler() {
        empty = true;
        boiled = false;
    }
    

    public void fill() {
        if(isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if(!isEmpty() && isBoiled()) {
            boiled = false;
            empty = true;
        }
    }

    public void boil() {
        if(!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
