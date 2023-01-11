package factory.abstractfactory.pimpl;

import factory.abstractfactory.AdvanceProduct;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 语法进阶
 */
@Data
public class GrammarAdvance implements AdvanceProduct {
    //描述
    private String describe;

    public GrammarAdvance() {
        this.describe = "语法进阶";

    }

    @Override
    public void learn() {
        System.out.println("学习" + describe);

    }
}
