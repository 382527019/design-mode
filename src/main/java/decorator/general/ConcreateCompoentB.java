package decorator.general;

/**
 * 装饰器对象
 */
public class ConcreateCompoentB extends Decorator{
    public ConcreateCompoentB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        System.out.println("B before-装饰器load... B能力");
        super.operation();//父类能力
        System.out.println("B after-装饰器load... B能力");
    }
}
