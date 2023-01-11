package factory.abstractfactory.pimpl;

import factory.abstractfactory.AdvanceProduct;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 语法进阶
 */
@Data
public class FrameworkAdvance implements AdvanceProduct {
    //描述
    private String describe;

    public FrameworkAdvance() {
        this.describe = "框架进阶";
    }

    @Override
    public void learn() {
        System.out.println("学习" + describe);
    }
}
