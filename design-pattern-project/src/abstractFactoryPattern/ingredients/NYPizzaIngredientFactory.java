package abstractFactoryPattern.ingredients;

import abstractFactoryPattern.ingredients.cheeses.Cheese;
import abstractFactoryPattern.ingredients.cheeses.ReggianoCheese;
import abstractFactoryPattern.ingredients.clams.Clams;
import abstractFactoryPattern.ingredients.clams.FreshClams;
import abstractFactoryPattern.ingredients.dough.Dough;
import abstractFactoryPattern.ingredients.dough.ThinCrustDough;
import abstractFactoryPattern.ingredients.pepperonis.Pepperoni;
import abstractFactoryPattern.ingredients.pepperonis.SlicedPepperoni;
import abstractFactoryPattern.ingredients.sauces.MarinaraSauce;
import abstractFactoryPattern.ingredients.sauces.Sauce;
import abstractFactoryPattern.ingredients.veggies.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {  // factory method
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {   // factory method
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {   // factory method
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {   // factory method
        Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {   // factory method
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {   // factory method
        return new FreshClams();
    }
}
