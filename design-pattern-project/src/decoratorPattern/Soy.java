package decoratorPattern;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return "";
    }

    public double cost() {
        return beverage.cost() + 0.15;
    }
}
