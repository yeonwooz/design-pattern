package commandPattern;

public class CeilingFan {
    public enum OnOffState {
        ON,
        OFF
    };

    public enum OptionState {
        Speed,
        Direction
    }

    public enum Speed {
        LOW,
        MEDIUM,
        HIGH,
    }

    public enum Direction {
        Horizontal,
        Vertical,
    }

    public enum Volume {
        MINUS,
        PLUS,
    }

    private String location;
    private OnOffState onOffState = OnOffState.OFF;
    private OptionState optionState = OptionState.Speed;
    private Speed speed = Speed.LOW;
    private Direction direction = Direction.Horizontal;

    public OnOffState getState() {
        return onOffState;
    }
    public Speed getSpeed() {
        return speed;
    }

    public OptionState getOptionState() {
        return optionState;
    }

    public Direction getDirection() {
        return direction;
    }

    public CeilingFan(String location) {
        this.location = location;
    }

    public void setOnOffState() {
        int nextOrdinal = (onOffState.ordinal() + 1) % OnOffState.values().length;
        onOffState = OnOffState.values()[nextOrdinal];

        System.out.println(this.location + " 선풍기가 " + onOffState);
    }

    public void setOptionState(Volume volume) {
        int amount = volume == Volume.PLUS ? +1 : -1;
        int len = OptionState.values().length;

        int nextOrdinal = (optionState.ordinal() + amount + len) % len;
        optionState = OptionState.values()[nextOrdinal];

        System.out.println("옵션 : " + optionState);
    }

    public void setSpeed(Volume volume) {
        int amount = volume == Volume.PLUS ? +1 : -1;
        int len = Speed.values().length;

        int nextOrdinal = (speed.ordinal() + amount + len) % len;
        speed = Speed.values()[nextOrdinal];

        System.out.println("속도 : " + speed);
    }

    public void setDirection(Volume volume) {
        int amount = volume == Volume.PLUS ? +1 : -1;
        int len = Direction.values().length;
        int nextOrdinal = (direction.ordinal() + amount + len) % len;
        direction = Direction.values()[nextOrdinal];

        System.out.println("풍향 : " + direction);
    }
}
