package structure.decorator;

public class Mocha extends  CondimentDecorator {

    public Mocha(Beverage beverage){
        this.beverage=beverage;
    }


    @Override
    public double cost() {
        return 8+beverage.cost();
    }
}
