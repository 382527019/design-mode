package observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject<E> implements ISubject<E> {
    /*监听容器*/
    private List<IObserver> observers = new ArrayList<>();

    private E msg;

    @Override
    public <E> boolean attach(IObserver<E> observer) {
        return !this.observers.contains(observer) && this.observers.add(observer);
    }

    @Override
    public <E> boolean detach(IObserver<E> observer) {
        return this.observers.remove(observer);
    }

    @Override
    public <E> void notify(E event) {
        for (IObserver<E> observer : this.observers) {
            observer.update(this,event);
        }
    }

    @Override
    public void updateMsg(E event) {
        this.msg = event;
    }

    public List<IObserver> getObservers() {
        return observers;
    }

    public void setObservers(List<IObserver> observers) {
        this.observers = observers;
    }

    public E getMsg() {
        return msg;
    }

    public void setMsg(E msg) {
        this.msg = msg;
    }
}
