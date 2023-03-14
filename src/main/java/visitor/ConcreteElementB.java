package visitor;

/**
 *
 */
public class ConcreteElementB implements IElement {
    @Override
    public void accept(IVisitor visitor) {
        System.out.println("访问者访问[B]"+visitor.getClass().getName());
        visitor. visit(this);
    }

    @Override
    public void operation() {
        System.out.println("元素的操作[B]");
    }
}
