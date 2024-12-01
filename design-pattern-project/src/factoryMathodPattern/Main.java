package factoryMathodPattern;

import pizzas.NYStylePizzaStore;
import pizzas.PizzaStore;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYStylePizzaStore();

        nyPizzaStore.orderPizza("cheese");


    }
}