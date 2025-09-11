package proxy_pattern;

public class GumballMachine {
    String location;
    int count;

    public GumballMachine(String location, int count) {
        this.location = location;
        this.count = count; 
    }

    public String getLocation() {
        return location;
    }

    public int getCount() {
        return count;
    }

    public String getState() {
        if (count > 0) {
            return "Gumballs available";
        } else {
            return "Sold out";
        }
    }
    
}