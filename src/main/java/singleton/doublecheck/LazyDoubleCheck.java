package singleton.doublecheck;

/**
 * 双重检查锁
 * 锁对性能——
 */
public class LazyDoubleCheck {
    //volatile 修饰不同线程访问和修改的同一个变量
    private volatile static LazyDoubleCheck instance;
    private LazyDoubleCheck(){}
    public static LazyDoubleCheck getInstance(){
        //看是否要阻塞
        if (instance == null){
            //锁
            synchronized (LazyDoubleCheck.class){
                //看是否要重新创建实例
                if (instance==null){
                    instance = new LazyDoubleCheck();
                }
            }
        }
        return instance;
    }
}
