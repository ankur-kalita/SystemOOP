package dacorator_pattern;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
    public double cost() {
        return beverage.cost() + 0.20;
    }
}
