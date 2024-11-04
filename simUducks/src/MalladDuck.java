import behavior.*;

public class MalladDuck extends Duck {

    public MalladDuck() {
        quackBehavior = new Squeak_outside();
        flyBehavior = new Fly_from_outside();
    }

    public void display() {
        System.out.println("저는 물오리입니당 :)");
    }
}
