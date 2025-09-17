package proxy_pattern.remote_proxy.client;

public interface State extends java.io.Serializable {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
    void refill();
}
