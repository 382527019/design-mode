package visitor;

/**
 *
 */
public class ConcreteElementA implements IElement {
    @Override
    public void accept(IVisitor visitor) {
        System.out.println(visitor.getClass().getName()+"访问者访问================[A]");
        visitor.visit(this);
    }

    @Override
    public void operation() {
        System.out.println(this.getClass().getName()+"元素的操作==============[A]");
    }
}
