package create.builder;

public class StringBuilder extends AbstractStringBuilder {
    public StringBuilder(){
        super(16);
    }

    public String toString(){
        return new String(value,0,count);
    }
}
