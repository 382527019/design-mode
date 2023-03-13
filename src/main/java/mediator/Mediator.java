package mediator;

/**
 * 中介者
 */
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
