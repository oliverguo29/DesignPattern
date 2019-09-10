package Create.prototype;

public class ConcretePrototype extends Prototype {
    private String field;

    public ConcretePrototype(String field) {
        this.field=field;
    }

    Prototype myclone(){
        return new ConcretePrototype(field);
    }

    public String toString(){
        return field;
    }
}
