package factory.abstractfactory.fimpl;

import factory.abstractfactory.AbstractFactory;
import factory.abstractfactory.AdvanceProduct;
import factory.abstractfactory.BaseProduct;
import factory.abstractfactory.MasterProduct;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GolangFactory extends AbstractFactory {
    //描述
    protected String Fdescribe;

    public GolangFactory(){
        this.Fdescribe = "Golang路线";
    }

    @Override
    public BaseProduct createBaseProduct(Class<? extends BaseProduct> clazz) {
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
    public AdvanceProduct createAdvanceProduct(Class<? extends AdvanceProduct> clazz) {
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
    public MasterProduct createMasterProduct(Class<? extends MasterProduct> clazz) {
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
