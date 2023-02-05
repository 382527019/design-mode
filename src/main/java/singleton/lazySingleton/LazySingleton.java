package singleton.lazySingleton;
//不加锁线程不安全
/*public class LazySingleton {
    private static LazySingleton lazySingleton =null;
    private LazySingleton(){}
    public static synchronized LazySingleton getInstance(){
        if (lazySingleton==null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}*/
/**
 * 懒汉
 * synchronized 加锁导致大量线程阻塞
 */
public class LazySingleton {
    private static LazySingleton lazySingleton =null;
    private LazySingleton(){}
    public static synchronized LazySingleton getInstance(){
        if (lazySingleton==null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
