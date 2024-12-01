package simUducks.behavior;

public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("Wing!");
    }
}
