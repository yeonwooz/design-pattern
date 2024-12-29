package commandPattern.custom;

import commandPattern.CeilingFan;

public class CeilingFanSelectOptionCommand implements CustomCommand {
    private CeilingFan ceilingFan;

    public CeilingFanSelectOptionCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        ceilingFan.setOptionState(CeilingFan.Volume.PLUS);
    }
}

