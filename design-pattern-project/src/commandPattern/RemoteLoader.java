package commandPattern;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        Door garageDoor = new Door("Garage");
        Stereo stereo = new Stereo("Living Room");

//        remote.setCommand(0, () -> livingRoomLight.on(), () -> livingRoomLight.off()); // 람다 함수  (람다함수는 Command 인터페이스에 하나의 함수만 있을 때 사용 가능)
//        remote.setCommand(1, () -> kitchenLight.on(), () -> kitchenLight.off());
//        remote.setCommand(2, () -> ceilingFan.on(), () -> ceilingFan.off());
//        remote.setCommand(3, stereo::on, stereo::off);  // 함수 참조

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);

        remote.onButtonWasPushed(0);
        remote.offButtonWasPushed(0);
        remote.undoButtonWasPushed();

        System.out.println(remote);

        remote.offButtonWasPushed(0);
        remote.onButtonWasPushed(0);
        remote.undoButtonWasPushed();

        System.out.println(remote);
    }
}
