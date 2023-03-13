package mediator;

/**
 * 中介者
 */
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
