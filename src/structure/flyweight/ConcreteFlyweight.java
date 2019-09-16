package structure.flyweight;

public class ConcreteFlyweight implements FlyWeight {

    private String instate;

    public ConcreteFlyweight(String instate){
        this.instate=instate;
    }

    @Override
    public void doOperation(String exstate) {
        System.out.println("Object address "+System.identityHashCode(this));
        System.out.println("inState "+instate);
        System.out.println("exState "+exstate);
    }


}
