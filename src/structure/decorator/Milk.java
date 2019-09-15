package structure.decorator;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage){
        this.beverage=beverage;
    }

    @Override
    public double cost() {
        return 5+beverage.cost();
    }
}
