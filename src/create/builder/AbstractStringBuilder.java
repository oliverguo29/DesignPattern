package create.builder;

import java.util.Arrays;

public class AbstractStringBuilder {
    protected char[] value;

    protected int count;

    public AbstractStringBuilder(int capacity){
        count=0;
        value = new char[capacity];
    }

    public AbstractStringBuilder append(char c){
        ensureCapacityInternal(count+1);
        value[count++]=c;
        return  this;
    }

    private void ensureCapacityInternal(int minimumcapacity){
        if(minimumcapacity-value.length>0){
            expand(minimumcapacity);
        }
    }

    void expand(int minimumcapacity){
        int newcapacity=value.length*2+2;   //扩容
        if(newcapacity-minimumcapacity<0){
            newcapacity=minimumcapacity;
        }

        if(newcapacity<0){
            if(minimumcapacity<0){
                throw new OutOfMemoryError();
            }
            newcapacity=Integer.MAX_VALUE;
        }
        value= Arrays.copyOf(value,newcapacity);
    }

}
