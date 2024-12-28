package commandPattern;

public class CeilingFan {
    private String location;

    public CeilingFan(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(this.location + " ceiling fan is on");
    }

    public void off() {
        System.out.println(this.location + " ceiling fan is off");
    }
}
