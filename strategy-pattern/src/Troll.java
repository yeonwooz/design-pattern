public class Troll extends Character{
    @Override
    public void fight() {
        if (weapon instanceof AxeBehavior) {
            weapon.useWeapon();
            System.out.println("가던길 가라");

            return;
        }
        System.out.println("우리편을 죽게 함");
    }
}
