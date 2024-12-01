package factoryMathodPattern.pizzas;

public class NYStylePizzaStore extends PizzaStore {
    Pizza pizza;

    Pizza createPizza(String type) {     // 오버라이드하지 말것
        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new NYStylePepperoniPizza();
        } else if (type.equals("clan")) {
            pizza = new NYStyleClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new NYStyleVeggiePizza();
        }

        return pizza;
    }
}