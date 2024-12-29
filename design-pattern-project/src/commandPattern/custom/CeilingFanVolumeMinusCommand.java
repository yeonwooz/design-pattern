package commandPattern.custom;

import commandPattern.CeilingFan;

public class CeilingFanVolumeMinusCommand implements CustomCommand {
    private CeilingFan ceilingFan;

    public CeilingFanVolumeMinusCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        CeilingFan.OptionState currentOption = ceilingFan.getOptionState();

        switch (currentOption) {
            case CeilingFan.OptionState.Speed -> ceilingFan.setSpeed(CeilingFan.Volume.MINUS);
            case CeilingFan.OptionState.Direction -> ceilingFan.setDirection(CeilingFan.Volume.MINUS);
        }
    }
}
