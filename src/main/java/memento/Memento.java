package memento;

/**
 *备忘录
 */
public class Memento {
    private String context;

    public Memento(String context) {
        this.context = context;
    }



    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    @Override
    public String toString() {
        return "Memento{" +
                "context='" + context + '\'' +
                '}';
    }
}
