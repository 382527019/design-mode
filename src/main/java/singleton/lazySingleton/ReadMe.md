###2.懒汉简单实现
~~~
public class LazySingleton {
    private static LazySingleton lazySingleton =null;
    private LazySingleton(){}
    public static LazySingleton getInstance(){
        if (lazySingleton==null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
~~~
输出 ——获取对象不一样，线程不安全
~~~
Thread-0:singleton.lazySingleton.LazySingleton@111e13e9
Thread-1:singleton.lazySingleton.LazySingleton@502d854
~~~
加锁.synchronized 其他线程实例化会被阻塞
~~~
public static synchronized LazySingleton getInstance(){
        if (lazySingleton==null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
~~~