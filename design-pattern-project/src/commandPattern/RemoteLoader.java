package commandPattern;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        Door garageDoor = new Door("Garage");
        Stereo stereo = new Stereo("Living Room");

        remote.setCommand(0, () -> livingRoomLight.on(), () -> livingRoomLight.off()); // 람다 함수
        remote.setCommand(1, () -> kitchenLight.on(), () -> kitchenLight.off());
        remote.setCommand(2, () -> ceilingFan.on(), () -> ceilingFan.off());
        remote.setCommand(3, stereo::on, stereo::off);  // 함수 참조

        remote.onButtonWasPushed(0);
        remote.offButtonWasPushed(0);
        remote.onButtonWasPushed(1);
        remote.offButtonWasPushed(1);
        remote.onButtonWasPushed(2);
        remote.offButtonWasPushed(2);
        remote.onButtonWasPushed(3);
        remote.offButtonWasPushed(3);
        remote.onButtonWasPushed(4);
        remote.offButtonWasPushed(4);
        remote.onButtonWasPushed(5);
        remote.offButtonWasPushed(5);
        remote.onButtonWasPushed(6);
        remote.offButtonWasPushed(6);
    }
}
