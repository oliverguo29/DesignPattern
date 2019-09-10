package Create.factoryMethod;



public class ConcreteFactory extends Factory {

    public Product factoryMethod(){
        return  new ConcreteProduct();
    }
}
