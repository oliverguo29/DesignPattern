package Create.factoryMethod;

import Create.simpleFactory.ConcreteProduct;


public class ConcreteFactory2 extends  Factory {
    
    public Product factoryMethod(){

        return  new ConcreteProduct2();
    }
}
