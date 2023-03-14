package visitor;

/**
 * 元素
 */
public interface IElement {
    void accept(IVisitor visitor);

    void operation();
}
