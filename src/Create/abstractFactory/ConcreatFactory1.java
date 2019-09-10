package Create.abstractFactory;

public class ConcreatFactory1 extends AbstractFactory {
    AbstractProductA createProductA(){
        return new ProductA1();
    }

    AbstractProductB createProductB(){
        return new ProductB1();
    }
}
