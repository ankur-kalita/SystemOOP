package proxy_pattern.gumball_machine_proxy.client;

public interface State extends java.io.Serializable {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
    void refill();
}
