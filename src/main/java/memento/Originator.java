package memento;

/**
 * 创建者
 */
public class Originator {
    private String context;

    public Originator(String context) {
        this.context = context;
    }

    /*设置备份*/
    public Memento setMemento() {
        return new Memento(this.context);
    }

    /*撤回备份*/
    public void recall(Memento memento){
        this.context = memento.getContext();
    }


    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
