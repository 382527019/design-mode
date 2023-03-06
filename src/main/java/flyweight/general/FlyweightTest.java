package flyweight.general;

/**
 * Created with IDEA
 * author:YunGui Hhuang
 * Date:2023/3/6
 * Time:23:25
 */
public class FlyweightTest {
    public static void main(String[] args) {
        Flyweight flyweight = FlyweightFactory.getFlyweight("内部信息1");
        Flyweight flyweight2 = FlyweightFactory.getFlyweight("内部信息2");
        flyweight.operattion("外部操作1");
        flyweight2.operattion("外部操作2");
        Flyweight flyweight3 = FlyweightFactory.getFlyweight("内部信息2");
        flyweight3.operattion("外部操作3");

    }
}
