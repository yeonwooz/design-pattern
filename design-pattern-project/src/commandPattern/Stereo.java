package commandPattern;

public class Stereo {
    private String location;

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(this.location + " stereo is on");
    }
    public void off() {
        System.out.println(this.location + " stereo is off");
    }
}
