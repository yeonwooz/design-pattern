package decoratorPattern;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return "";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.2;
    }
}
