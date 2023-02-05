package singleton.lazySingleton;

/**
 * Created with IDEA
 * author:YunGui Hhuang
 * Date:2023/2/5
 * Time:20:45
 */
public class LazySingletonTest {
    public static void main(String[] args) {
        Thread thread = new Thread(new ExectorThread());
        Thread thread1 = new Thread(new ExectorThread());
        thread.start();
        thread1.start();
        System.out.println("===");
    }
}
