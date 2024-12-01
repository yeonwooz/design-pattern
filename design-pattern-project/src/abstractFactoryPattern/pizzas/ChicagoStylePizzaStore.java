package abstractFactoryPattern.pizzas;

public class ChicagoStylePizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {
        System.out.println(this.getStoreName());

        Pizza pizza = null;
        // TODO: ChicagoStyleIngredientFactory 에 의존하도록 변경하기

        return pizza;
    }

    String getStoreName() {
        return "시카고 피자가게입니다!";
    }
}