# 中介者模式
* 用一个中介对象封装其他对象交互，中介者独立改变他们之间的交互
* 系统对象存在复杂引用关系，交互的公共行为，如果需要改变行为则可以增加新的中介类
![image](https://user-images.githubusercontent.com/64847551/227155415-8d20f1e9-4f28-45b6-8745-6255b3006553.png)

---

* 中介者抽象
~~~
public abstract class Mediator {

    protected Colleague colleague;
    /*状态 */
    private boolean  state =true;

    public abstract void setColleague(Colleague colleague);
    /*中介者处理的方法*/
    public abstract void transfer();

    public Colleague getColleague() {
        return colleague;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
~~~
* 具体中介者处理
~~~
public  class ConcreteMediator extends Mediator {

    /**/
    @Override
    public void setColleague(Colleague colleague) {
        this.colleague = colleague;
    }

    @Override
    public void transfer() {
        /*中介者处理其他对象方法*/
        this.colleague.selfMethod();
        this.setState(false);
    }
}
~~~

* 同类型抽象
~~~
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    /*自己的方法*/
    public abstract void selfMethod();

    /*依赖方法*/
    public abstract void depMethod();

    /*中介者状态判断*/
    public boolean mediatorDecide(){
        if (this.mediator.colleague==null || this.mediator.colleague.getClass().getName().equals(this.getClass().getName())){
            System.out.println(this.mediator.colleague.getClass().getName()+"调用错误");
            return false;
        }
        if (!this.mediator.isState()){
            System.out.println(this.mediator.getClass().getName()+"在忙");
            return false;
        }
        return true;
    }

}
~~~
* 具体同类对象
  * `this.mediator.transfer();`中介者调用其他同类的方法
~~~
public class ConcreteColleagueA extends Colleague {

    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    /*自己的方法*/
    public void selfMethod(){
        System.out.println(this.getClass().getName()+"[A]self");
    }

    /*依赖方法*/
    public void depMethod(){
        System.out.println(this.getClass().getName()+"[A]dep self handler");
        /*中介者判断*/
        if (!mediatorDecide()) {
            return;
        }
        /*中介者处理*/
        this.mediator.transfer();
    }
}
~~~

* main
~~~
public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Colleague concreteColleagueA = new ConcreteColleagueA(mediator);
        Colleague concreteColleagueB = new ConcreteColleagueB(mediator);
        System.out.println("===============");
        /*A实现*/
        concreteColleagueA.selfMethod();
        /*A 让中介者联系-B*/
        mediator.setColleague(concreteColleagueB);
        concreteColleagueA.depMethod();
        mediator.setState(true);//完成
        System.out.println("===============");
        /*B实现*/
        concreteColleagueB.selfMethod();
        /*B 让中介者联系-A*/
        mediator.setColleague(concreteColleagueA);
        concreteColleagueB.depMethod();
        System.out.println("===============");
        /*A 没让中介者联系-B*/
        concreteColleagueA.depMethod();

        /*  ===============
            mediator.ConcreteColleagueA[A]self
            mediator.ConcreteColleagueA[A]dep self handler
            mediator.ConcreteColleagueB[B]self
            ===============
            mediator.ConcreteColleagueB[B]self
            mediator.ConcreteColleagueB[B]dep self handler
            mediator.ConcreteColleagueA[A]self
            ===============
            mediator.ConcreteColleagueA[A]dep self handler
            mediator.ConcreteColleagueA调用错误*/

    }
~~~
