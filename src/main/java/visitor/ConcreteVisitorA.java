package visitor;

/**
 * Created with IDEA
 * author:YunGui Hhuang
 * Date:2023/3/13
 * Time:22:23
 */
public class ConcreteVisitorA implements IVisitor {

    @Override
    public void visit(ConcreteElementA element) {
        System.out.println("开始访问，操作：[A]");
        element.operation();
    }

    @Override
    public void visit(ConcreteElementB element) {
        System.out.println("开始访问，操作：[B]");
        element.operation();
    }
}
