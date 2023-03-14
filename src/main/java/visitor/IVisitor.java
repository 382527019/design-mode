package visitor;

/**
 * 访问者，不同元素访问 结果不同
 */
public interface IVisitor {

    /*一类元素访问*/
    void visit(ConcreteElementA element);
    /*一类元素访问*/
    void visit(ConcreteElementB element);
}
