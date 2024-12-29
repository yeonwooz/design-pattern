package commandPattern.custom;

import commandPattern.CeilingFan;

public class CeilingFanVolumePlusCommand implements CustomCommand {
    private CeilingFan ceilingFan;

    public CeilingFanVolumePlusCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        CeilingFan.OptionState currentOption = ceilingFan.getOptionState();

        switch (currentOption) {
            case CeilingFan.OptionState.Speed -> ceilingFan.setSpeed(CeilingFan.Volume.PLUS);
            case CeilingFan.OptionState.Direction -> ceilingFan.setDirection(CeilingFan.Volume.PLUS);
        }
    }
}
