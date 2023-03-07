# 享元模式
工厂方法模式改进，生成一组具有缓存的对象。池化思想。
用于系统有大量相似对象，需要缓冲池的场景。
* 抽象享元角色（IFlyweight）
  * 定义对象内部、外部状态接口与实现
  ~~~
  public abstract class Flyweight {

    abstract String operattion(String extrinsicState);
  }
  ~~~
* 具体享元角色（ConcreteFlyweight）
  * 定义角色业务，内部状态处理与环境无关。
  * 不会出现一个操作同时改变内部、外部状态的情况
  ~~~
  public class ConcreteFlyweight extends Flyweight{

    /* 内部状态*/
    private String intrinsicState;

    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    /* 外部状态*/
    @Override
    String operattion(String extrinsicState) {
        System.out.println("Obj address:" +this);
        System.out.println("Obj intrinsicState:" +this.intrinsicState);
        System.out.println("Obj extrinsicState:" +extrinsicState);
        return this+"享元操作结束";
    }
  }
  ~~~
* 享元工厂（FlyweightFactory）
  * 负责管理享元对象池和创建
  ~~~
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
  ~~~