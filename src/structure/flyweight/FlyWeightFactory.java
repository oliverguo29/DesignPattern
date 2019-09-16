package structure.flyweight;

import java.util.HashMap;

public class FlyWeightFactory {
    private HashMap<String,FlyWeight> flyweight= new HashMap<>();

    FlyWeight getFlyWeight(String inState){
        if(!flyweight.containsKey(inState)){
            FlyWeight fly = new ConcreteFlyweight(inState);
            flyweight.put(inState,fly);
        }
        return flyweight.get(inState);
    }
}
