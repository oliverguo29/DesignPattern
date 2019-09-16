package behaviour.ResponsibilityChain;

public class ConcreteHandler2 extends  Handler {

    public ConcreteHandler2(Handler successor) {

        super(successor);
    }

    @Override
    protected void handlerRequest(Request request) {
        if(request.getType()==RequestType.TYPE2){

            System.out.println(request.getName()+" is handle by 2");

            return;
        }
        if (successor!=null){
            successor.handlerRequest(request);
        }
    }
}
