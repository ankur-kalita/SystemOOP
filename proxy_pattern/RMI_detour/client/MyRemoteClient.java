package proxy_pattern.RMI_detour.client;

// the naming class (for doing the rmiregistry lookup) is in the java.rmi package
// it comes out of the rmi registry as type Object, so we need to cast it to the appropriate type

import java.rmi.*;

import proxy_pattern.RMI_detour.server.MyRemote;

public class MyRemoteClient {
    public static void main(String[] args) {
        new MyRemoteClient().go();
    }

    public void go() {
        try {
            MyRemote service = (MyRemote) Naming.lookup("rmi://0.0.0.0/RemoteHello");
            String s = service.sayHello();
            System.out.println(s);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
