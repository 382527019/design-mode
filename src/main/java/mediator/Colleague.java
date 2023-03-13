package mediator;

/**
 * 同事 相似类
 */
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
