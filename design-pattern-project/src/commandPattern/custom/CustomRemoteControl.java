package commandPattern.custom;

import commandPattern.Command;
import commandPattern.NoCommand;

/*
리모컨 버튼 재배치
[slot] [On/Off] [Select Option] [+] [-]
 */
public class CustomRemoteControl {
    CustomCommand[] onOffCommands;
    CustomCommand[] selectOptionCommands;
    CustomCommand[] plusCommands;
    CustomCommand[] minusCommands;

    public CustomRemoteControl() {
        onOffCommands = new CustomCommand[7];
        selectOptionCommands = new CustomCommand[7];
        plusCommands = new CustomCommand[7];
        minusCommands = new CustomCommand[7];
        CustomCommand noCommand = new CustomNoCommand();

        for (int i = 0; i < 7; i++) {
            onOffCommands[i] = noCommand;
            selectOptionCommands[i] = noCommand;
            plusCommands[i] = noCommand;
            minusCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, CustomCommand onOffcommand, CustomCommand selectOptionCommand, CustomCommand plusCommand, CustomCommand minusCommand) {
        onOffCommands[slot] = onOffcommand;
        if (selectOptionCommand != null) {
            selectOptionCommands[slot] = selectOptionCommand;
        }
        if (plusCommand != null) {
            plusCommands[slot] = plusCommand;
        }

        if (minusCommand != null) {
            minusCommands[slot] = minusCommand;
        }
    }

    public void onOffButtonWasPushed(int slot) {
        onOffCommands[slot].execute();
    }

    public void selectOptionButtonWasPushed(int slot) {
        selectOptionCommands[slot].execute();
    }

    public void plusButtonWasPushed(int slot) {
        plusCommands[slot].execute();
    }

    public void minusButtonWasPushed(int slot) {
        minusCommands[slot].execute();
    }

    public String toString() {
        StringBuffer stringBuff = new StringBuffer();

        stringBuff.append("\n----- 커스텀 리모컨 -----\n");
        for (int i = 0; i < onOffCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " + onOffCommands[i].getClass().getName() + "   " + onOffCommands[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }
}
