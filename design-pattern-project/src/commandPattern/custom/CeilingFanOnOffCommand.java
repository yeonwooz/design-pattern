package commandPattern.custom;

import commandPattern.CeilingFan;

public class CeilingFanOnOffCommand implements CustomCommand {
    private CeilingFan ceilingFan;

    public CeilingFanOnOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        ceilingFan.setOnOffState();
    }
}
