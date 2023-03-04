package decorator.general;

/**
 * 装饰器对象
 */
public class ConcreateCompoentA extends Decorator{
    public ConcreateCompoentA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        System.out.println("A before-装饰器load... A能力");
        super.operation();
        System.out.println("A after-装饰器load... A能力");
    }
}
