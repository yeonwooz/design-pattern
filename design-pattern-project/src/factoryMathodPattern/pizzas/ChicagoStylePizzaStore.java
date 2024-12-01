package factoryMathodPattern.pizzas;

public class ChicagoStylePizzaStore extends PizzaStore {
    Pizza pizza;

    Pizza createPizza(String type) {   // 오버라이드하지 말것
        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        }
        return pizza;
    }
}