package decorator.general;

/**
 * 装饰器对象
 */
public class ConcreateCompoent extends Component{
    @Override
    public void operation() {
        System.out.println("装饰器load...扩展功能处理能力");
    }
}
