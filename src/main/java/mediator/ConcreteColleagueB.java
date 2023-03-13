package mediator;

/**
 *
 */
public class ConcreteColleagueB extends Colleague {

    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    /*自己的方法*/
    public void selfMethod() {
        System.out.println(this.getClass().getName() + "[B]self");
    }

    /*依赖方法*/
    public void depMethod() {
        System.out.println(this.getClass().getName() + "[B]dep self handler");
        /*中介者判断*/
        if (!mediatorDecide()) {
            return;
        }
        /*中介者处理*/
        this.mediator.transfer();
    }
}
