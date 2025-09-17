package proxy_pattern.gumball_machine_proxy.server;

import java.rmi.Naming;

public class GumballMachineTestDrive {
    public static void main(String[] args) {

        GumballMachineRemote gumballMachine = null;

        int count;

        if (args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }

        try {
            count = Integer.parseInt(args[1]);
            gumballMachine = new GumballMachine(count, args[0]);
            Naming.rebind("//" + args[0] + "/gumballmachine", gumballMachine);
            System.out.println("Gumball Machine is ready.");
        } catch (Exception e) {
            e.printStackTrace();   
        }
        // GumballMonitor monitor = new GumballMonitor(gumballMachine);

        // monitor.report();

        // System.out.println(gumballMachine);

        // gumballMachine.insertQuarter();
        // gumballMachine.turnCrank();

        // System.out.println(gumballMachine);

        // gumballMachine.insertQuarter();
        // gumballMachine.turnCrank();
        // gumballMachine.insertQuarter();
        // gumballMachine.turnCrank();

        // System.out.println(gumballMachine);


    }
}
