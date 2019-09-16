package behaviour.ResponsibilityChain;

public class Client {
    public static void main(String[] args) {
        Handler h1 = new ConcreteHandler1(null);
        Handler h2 = new ConcreteHandler2(h1);

        Request r1 = new Request(RequestType.TYPE1,"req1");
        h2.handlerRequest(r1);

        Request r2 = new Request(RequestType.TYPE2,"req2");
        h2.handlerRequest(r2);


    }

}
