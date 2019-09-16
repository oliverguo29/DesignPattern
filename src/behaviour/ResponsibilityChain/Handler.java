package behaviour.ResponsibilityChain;

public abstract class Handler {
    protected Handler successor;

    public Handler(Handler successor) {
        this.successor = successor;
    }

    protected abstract void handlerRequest(Request request);

}
