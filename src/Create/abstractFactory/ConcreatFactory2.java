package Create.abstractFactory;

public class ConcreatFactory2 extends AbstractFactory {
    AbstractProductA createProductA(){

        return new ProductA2();
    }

    AbstractProductB createProductB(){
        return new ProductB2();
    }
}
