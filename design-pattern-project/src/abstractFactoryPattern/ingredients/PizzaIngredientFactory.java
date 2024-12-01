package abstractFactoryPattern.ingredients;

import abstractFactoryPattern.ingredients.cheeses.Cheese;
import abstractFactoryPattern.ingredients.clams.Clams;
import abstractFactoryPattern.ingredients.dough.Dough;
import abstractFactoryPattern.ingredients.pepperonis.Pepperoni;
import abstractFactoryPattern.ingredients.sauces.Sauce;
import abstractFactoryPattern.ingredients.veggies.Veggies;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClams();
}
