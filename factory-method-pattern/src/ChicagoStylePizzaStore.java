public class ChicagoStylePizzaStore extends PizzaStore {
    Pizza pizza;

    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        }
        return pizza;
    }
}
