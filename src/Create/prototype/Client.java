package Create.prototype;

public class Client {

    public static void main(String[] args) {
        Prototype prototype = new ConcretePrototype("aaaa");
        Prototype clone = prototype.myclone();
        System.out.println(clone.toString());
    }
}
