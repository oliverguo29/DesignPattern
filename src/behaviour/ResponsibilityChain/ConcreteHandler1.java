package behaviour.ResponsibilityChain;

public class ConcreteHandler1 extends  Handler {

    public ConcreteHandler1(Handler successor) {
        super(successor);
    }

    @Override
    protected void handlerRequest(Request request) {
        if(request.getType()==RequestType.TYPE1){
            System.out.println(request.getName()+" is handle by 1 ");
            return;
        }
        if (successor!=null){
            successor.handlerRequest(request);
        }
    }
}
