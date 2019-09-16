package structure.flyweight;

public class Client {

    public static void main(String[] args) {
        FlyWeightFactory factory = new FlyWeightFactory();
        FlyWeight flyWeight1 = factory.getFlyWeight("aa");
        FlyWeight flyWeight2 = factory.getFlyWeight("aa");

        flyWeight1.doOperation("x");
        flyWeight2.doOperation("y");
    }




}
