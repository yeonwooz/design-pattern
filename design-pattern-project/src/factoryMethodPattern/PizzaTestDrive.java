package factoryMethodPattern;

import abstractFactoryPattern.pizzas.NYStylePizzaStore;
import abstractFactoryPattern.pizzas.ChicagoStylePizzaStore;
import abstractFactoryPattern.pizzas.Pizza;
import abstractFactoryPattern.pizzas.PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("에단이 주문한 " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("조던이 주문한 " + pizza.getName() + "\n");
    }
}