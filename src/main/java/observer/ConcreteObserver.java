package observer;

/**
 * 观察者
 * 回调、更新信息
 */
public class ConcreteObserver<E> implements IObserver<E> {
    @Override
    public void update(ISubject subject,E e) {
        System.out.println("收到事件："+e+"。执行回调方法更新被观察者信息状态");
        subject.updateMsg(e);
    }
}
