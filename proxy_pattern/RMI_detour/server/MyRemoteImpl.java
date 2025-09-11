package proxy_pattern.RMI_detour.server;

// unicastRemoteObject is the java RMI server class
// extending unicastRemoteObject is the easiest way to enables the class to be a remote object
// unicastRemoteObject implements serializable so must have a serialVersionUID
// you must implements the remote interface
// ur superclass constuctor throws RemoteException, so must make a empty constructor that throws RemoteException
// make the remote object and bind it to the registry using the static method Naming.rebind().
// the name u register it under is the name clients will use to look it up

import java.rmi.*;
import java.rmi.server.*;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote{
    private static final long serialVersionUID = 1L;

    public String sayHello() {
        return "Server says, 'Hey'";
    }

    public MyRemoteImpl() throws RemoteException {}

    public static void main(String[] args) {
        try {
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("RemoteHello", service);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
