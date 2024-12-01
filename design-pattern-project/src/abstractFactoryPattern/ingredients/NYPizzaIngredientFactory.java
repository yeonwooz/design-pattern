package abstractFactoryPattern.ingredients;

import ingredients.cheeses.Cheese;
import ingredients.cheeses.ReggianoCheese;
import ingredients.clams.Clams;
import ingredients.clams.FreshClams;
import ingredients.dough.Dough;
import ingredients.dough.ThinCrustDough;
import ingredients.pepperonis.Pepperoni;
import ingredients.pepperonis.SlicedPepperoni;
import ingredients.sauces.MarinaraSauce;
import ingredients.sauces.Sauce;
import ingredients.veggies.*;

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
