package factory.abstractfactory.pimpl;

import factory.abstractfactory.BaseProduct;
import factory.abstractfactory.fimpl.GolangFactory;
import factory.method.IProduct;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 语法基础
 */
@Data
public class GrammarBase implements BaseProduct {

    //描述
    private String describe;

    public GrammarBase() {
        this.describe = "语法基础";

    }
    @Override
    public void learn() {
        System.out.println("学习" + describe);

    }
}
