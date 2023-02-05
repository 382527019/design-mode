package singleton.lazySingleton;

/**
 * Created with IDEA
 * author:YunGui Hhuang
 * Date:2023/2/5
 * Time:20:43
 */
public class ExectorThread implements Runnable{
    @Override
    public void run() {

        LazySingleton instance = LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+instance);
    }
}
