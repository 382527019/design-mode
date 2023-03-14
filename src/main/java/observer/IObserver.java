package observer;

/**
 * 观察者
 */
public interface IObserver<E> {
    void update(ISubject subject,E e);
}
