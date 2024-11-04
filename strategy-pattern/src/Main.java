public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Troll troll = new Troll();
        troll.setWeapon(new AxeBehavior());
        troll.fight();

    }

}