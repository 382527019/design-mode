package observer;

import java.util.Vector;

/**
 * 被观察者
 */
public interface ISubject<E> {

    /*增加事件监控*/
    <E>boolean attach(IObserver<E> observer);

    /*移除事件监控*/
    <E>boolean detach(IObserver<E> observer);

    /*事件通知*/
    <E>void notify(E event);

    void updateMsg(E e);

}
