package factory.abstractfactory.fimpl;

import factory.abstractfactory.AbstractFactory;
import factory.abstractfactory.AdvanceProduct;
import factory.abstractfactory.BaseProduct;
import factory.abstractfactory.MasterProduct;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class JavaFactory extends AbstractFactory {
    //描述
    protected String Fdescribe;

    public JavaFactory(){
        this.Fdescribe = "JAVA路线";
    }

    @Override
    protected BaseProduct createBaseProduct(Class<? extends BaseProduct> clazz) {
        BaseProduct baseProduct = null;
        try {
            baseProduct = clazz.newInstance();
            System.out.println(this.Fdescribe+"==");
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return baseProduct;
    }

    @Override
    protected AdvanceProduct createAdvanceProduct(Class<? extends AdvanceProduct> clazz) {
        AdvanceProduct advanceProduct = null;
        try {
            advanceProduct = clazz.newInstance();
            System.out.println(this.Fdescribe+"==");
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return advanceProduct;
    }

    @Override
    protected MasterProduct createMasterProduct(Class<? extends MasterProduct> clazz) {
        MasterProduct masterProduct = null;
        try {
            masterProduct = clazz.newInstance();
            System.out.println(this.Fdescribe+"==");
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return masterProduct;
    }
}
