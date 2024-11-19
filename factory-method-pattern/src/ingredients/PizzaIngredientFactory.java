package ingredients;

import ingredients.cheeses.Cheese;
import ingredients.clams.Clams;
import ingredients.dough.Dough;
import ingredients.pepperonis.Pepperoni;
import ingredients.sauces.Sauce;
import ingredients.veggies.Veggies;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClams();
}
