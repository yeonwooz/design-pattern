package strategyPattern;

import java.lang.Character;

public class Queen extends Character {
    @Override
    public void fight() {
        System.out.println("포로로 만드는 공격");
    }
}
