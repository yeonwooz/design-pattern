package strategyPattern;

import java.lang.Character;

public class King extends Character {
    @Override
    public void fight() {
        System.out.println("1턴 쉬게 함");
    }
}
