# 观察者模式
* 发布-订阅模式、模型-视图模式、听器模式、从属者模式
* 一个主体对象可被多个观察者对象同时监听，状态变化时，所有依赖于它的对象都会收到通知
  * 监听回调
---
* main
~~~
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
~~~

* 被观察者（主题）
~~~
public interface ISubject<E> {

    /*增加事件监控*/
    <E>boolean attach(IObserver<E> observer);

    /*移除事件监控*/
    <E>boolean detach(IObserver<E> observer);

    /*事件通知*/
    <E>void notify(E event);

    void updateMsg(E e);

}
~~~
具体实现
~~~
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
~~~
* 观察者
~~~
public interface IObserver<E> {
    void update(ISubject subject,E e);
}
~~~

实现
~~~
public class ConcreteObserver<E> implements IObserver<E> {
    @Override
    public void update(ISubject subject,E e) {
        System.out.println("收到事件："+e+"。执行回调方法更新被观察者信息状态");
        subject.updateMsg(e);
    }
}
~~~