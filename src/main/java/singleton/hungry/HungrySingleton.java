package singleton.hungry;

/**
 * 饿汉式静态块单例模式（单例对象少时适用）
 * 线程安全、类加载时clinit执行静态块 效率高
 */
public class HungrySingleton {
    private static final HungrySingleton HUNGRY_SINGLETON;

    //缺点：类加载时实例化  内存一直存在
    static {
        HUNGRY_SINGLETON = new HungrySingleton();
    }

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return HUNGRY_SINGLETON;
    }
}
