package visitor;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 对象结构
 */
@Data
public class ObjectStructure {
    private final static List<IElement> elements = new ArrayList<>();

static {
    elements.add(new ConcreteElementA());
    elements.add(new ConcreteElementB());
}
    public void accept(IVisitor visitor){
        for (IElement element :elements) {
            element.accept(visitor);
        }
    }

    public static void main(String[] args) {
        IVisitor concreteVisitorA = new ConcreteVisitorA();
        IVisitor concreteVisitorB = new ConcreteVisitorB();
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.accept(concreteVisitorA);
        System.out.println("============");
        objectStructure.accept(concreteVisitorB);
        System.out.println("==========");

        new ConcreteElementA().accept(concreteVisitorA);

        new ConcreteElementA().accept(concreteVisitorB);
    }
}
