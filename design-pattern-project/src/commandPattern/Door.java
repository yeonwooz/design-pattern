package commandPattern;

public class Door {
    private String location;

    public Door(String location) {
        this.location = location;
    }

    public void up() {
        System.out.println(this.location + "door is up");
    }

    public void down() {
        System.out.println(this.location + "door is down");
    }

    public void stop() {
        System.out.println(this.location + "door is stopped");
    }

    public void lightOn() {
        System.out.println(this.location + "door light is on");
    }

    public void lightOff() {
        System.out.println(this.location + "door light is off");
    }
}
