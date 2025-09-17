package proxy_pattern.gumball_machine_proxy.server;

public class NoQuarterState implements State {
    private static final long serialVersionUID = 2L;
    transient GumballMachine gumballMachine; // transient keyword tell the JVM to ignore this field when serializing the object
    // but this can be slightly dangerous if we try to access this field once the object's been serialized and transferred.

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned but there's no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }

    @Override
    public void refill() {
        System.out.println("Can't refill when there's no quarter in the machine");
    }

    public String toString() {
        return "waiting for quarter";
    }
    
}
