package command_pattern;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingroomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingroomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingroomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        Command[] partyOn = { livingRoomLightOn, stereoOn };
        Command[] partyOff = { livingRoomLightOff, stereoOff };

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, stereoOn, stereoOff);
        remoteControl.setCommand(3, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0); 
        remoteControl.offButtonWasPushed(0); 
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        System.out.println("\n--- Party Mode ---");
        remoteControl.onButtonWasPushed(3); 
        System.out.println("\n--- Parties are for brokies ---");
        remoteControl.offButtonWasPushed(3); 
        remoteControl.undoButtonWasPushed();
    }
}
