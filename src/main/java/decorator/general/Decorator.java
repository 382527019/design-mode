package decorator.general;

/**
 * 装饰对象CncreateCompoent的装饰器，
 * 让Decorator子类实现强制指定构造方式
 */
public abstract class Decorator extends Component{
    /**组件对象*/
    protected Component component;

    public Decorator(Component component){
        this.component = component;
    }
    @Override
    public void operation() {
        System.out.println("decorator befor do ....");
        this.component.operation();//执行组件功能
        System.out.println("decorator after do ....");
    }
}
