package flyweight.general;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂
 */
public class FlyweightFactory {
    private static Map<String, Flyweight> pool = new HashMap<String, Flyweight>();
    //内部状态不可变，作key

    public static Flyweight getFlyweight(String intrinsicState){
        if (!pool.containsKey(intrinsicState)){
            Flyweight concreteFlyweight = new ConcreteFlyweight(intrinsicState);
            pool.put(intrinsicState, concreteFlyweight);
        }
        return pool.get(intrinsicState);
    }
}
