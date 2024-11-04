import behavior.FlyWithWings;
import behavior.Quack;

public class Main {
    public static void main(String[] args) {
        System.out.println(args[0]);

        System.out.println("Hello world!");
//        Duck duck = new Duck(new FlyWithWings(), new Quack());

        MalladDuck mallardDuck = new MalladDuck();
        mallardDuck.display();
        mallardDuck.performQuack();
    }
}