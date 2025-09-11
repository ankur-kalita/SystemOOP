package proxy_pattern.RMI_detour.server;

import java.rmi.*;

public interface MyRemote extends Remote {
    // my interface must extend Remote...this tells us that the interface is going to be used to support remote calls.
    // remote methods must throw RemoteException.
    // be sure arguments and return values are Serializable (or primitive types).
    public String sayHello() throws RemoteException;
}
