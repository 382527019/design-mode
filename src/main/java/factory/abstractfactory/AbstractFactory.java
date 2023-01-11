package factory.abstractfactory;


/**
 * 抽象工厂
 */
public abstract class AbstractFactory {
    //创建基础产品
    protected abstract BaseProduct createBaseProduct(Class<? extends BaseProduct> clazz);
    //创建进阶产品
    protected abstract AdvanceProduct createAdvanceProduct(Class<? extends AdvanceProduct> clazz);
    //创精通产品
    protected abstract MasterProduct createMasterProduct(Class<? extends MasterProduct> clazz);
}
