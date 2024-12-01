package decoratorPattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Beverage houseBlend = new HouseBlend();
        Soy soy = new Soy(houseBlend);
        Mocha mocha = new Mocha(soy);
        Mocha mocha2 = new Mocha(mocha);  // TODO: 중복제거할 방법 고민
        Whip whip = new Whip(mocha2);

        Double cost = whip.cost();
        System.out.println(String.format("%,.2f", cost));
    }
}