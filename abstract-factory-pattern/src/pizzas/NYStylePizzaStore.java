package pizzas;

import ingredients.NYPizzaIngredientFactory;
import ingredients.PizzaIngredientFactory;

public class NYStylePizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {
        System.out.println(this.getStoreName());
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        
        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("뉴욕 치즈 피자");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("뉴욕 야채 피자");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("뉴욕 조개 피자");
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("뉴욕 페페로니 피자");
        }
        return pizza;
    }
    
    String getStoreName() {
        return "뉴욕 피자가게입니다!";
    }
}
