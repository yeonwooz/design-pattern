package commandPattern.custom;

import commandPattern.CeilingFan;

public class CustomRemoteLoader {
    public static void main(String[] args) {
        CustomRemoteControl remoteControl = new CustomRemoteControl();
        CeilingFan ceilingFan = new CeilingFan("Living Room");

        CeilingFanOnOffCommand ceilingFanOnOffCommand = new CeilingFanOnOffCommand(ceilingFan);
        CeilingFanSelectOptionCommand ceilingFanSelectOptionCommand = new CeilingFanSelectOptionCommand(ceilingFan);

        CeilingFanVolumePlusCommand ceilingFanVolumePlusCommand = new CeilingFanVolumePlusCommand(ceilingFan);
        CeilingFanVolumeMinusCommand ceilingFanVolumeMinusCommand = new CeilingFanVolumeMinusCommand(ceilingFan);

        remoteControl.setCommand(0, ceilingFanOnOffCommand, ceilingFanSelectOptionCommand, ceilingFanVolumePlusCommand, ceilingFanVolumeMinusCommand);

        // on off
        System.out.println("> On/Off");
        remoteControl.onOffButtonWasPushed(0);  // Living Room 선풍기가 ON
        remoteControl.onOffButtonWasPushed(0);  // Living Room 선풍기가 OFF
        remoteControl.onOffButtonWasPushed(0);  // Living Room 선풍기가 ON

        // select option -> set speed
        System.out.println("\n> Set Speed");

        // set speed
        System.out.println("Speed up");
        remoteControl.plusButtonWasPushed(0); // 속도 : MEDIUM
        remoteControl.plusButtonWasPushed(0); // 속도 : HIGH
        remoteControl.plusButtonWasPushed(0); // 속도 : LOW

        System.out.println("Speed down");
        remoteControl.minusButtonWasPushed(0); // 속도 : HIGH
        remoteControl.minusButtonWasPushed(0); // 속도 : MEDIUM
        remoteControl.minusButtonWasPushed(0); // 속도 : LOW

        // select option -> set direction
        System.out.println("\n> Set Direction");
        remoteControl.selectOptionButtonWasPushed(0);  // 옵션 : Direction

        // set direction
        remoteControl.plusButtonWasPushed(0);  // 풍향 : Vertical
        remoteControl.plusButtonWasPushed(0);  // 풍향 : Horizontal
        remoteControl.plusButtonWasPushed(0);  // 풍향 : Vertical

        remoteControl.minusButtonWasPushed(0);  // 풍향 : Horizontal
        remoteControl.minusButtonWasPushed(0);  // 풍향 : Vertical
        remoteControl.minusButtonWasPushed(0);  // 풍향 : Horizontal
    }
}
