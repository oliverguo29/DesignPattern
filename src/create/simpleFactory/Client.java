package create.simpleFactory;

public class Client {

    public static void main(String[] args) {
        int type=1; //用户自定义
        Product product;

        TestSimpleFactory factory = new TestSimpleFactory();
        product = factory.createProduct(type);



    }
}
