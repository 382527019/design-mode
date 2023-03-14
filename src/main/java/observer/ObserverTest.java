package observer;

/**
 * Created with IDEA
 * author:YunGui Hhuang
 * Date:2023/3/14
 * Time:11:52
 */
public class ObserverTest {

    public static void main(String[] args) {
        /*主题发布*/
        ConcreteSubject subject = new ConcreteSubject();
        /*监控事件*/
        ConcreteObserver<String> observer = new ConcreteObserver<>();
        /*主题增加*/
        subject.attach(observer);
        /*通知*/
        subject.notify("触发");
        Object msg = subject.getMsg();
        System.out.println("subject.msg:"+msg);
        /*  收到事件：触发。执行回调方法更新被观察者信息状态
            subject.msg:触发*/
    }
}
