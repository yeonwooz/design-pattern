import behavior.FlyBehavior;
import behavior.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

//    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
//        this.flyBehavior = flyBehavior;
//        this.quackBehavior = quackBehavior;
//    }
}
