package factory.abstractfactory.pimpl;

import factory.abstractfactory.MasterProduct;
import factory.abstractfactory.fimpl.PythonFactory;
import factory.method.IProduct;
import lombok.Data;

/**
 语法精通
 */
@Data
public class GrammarMaster implements MasterProduct {
    //描述
    private String describe;

    public GrammarMaster() {
        this.describe = "语法精通";

    }
    @Override
    public void learn() {
        System.out.println("掌握" + describe);
    }
}
