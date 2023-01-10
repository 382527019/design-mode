package factory.simple.impl;

import factory.simple.ICarProduct;

/**
 *汽油车 工厂 实现 车工厂
 */
public class GasolineCarProduct implements ICarProduct {
    @Override
    public void doSomething() {
        System.out.println("GasolineCarProduct 生产汽油车");
    }
}
