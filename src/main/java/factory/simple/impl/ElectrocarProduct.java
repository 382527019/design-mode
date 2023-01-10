package factory.simple.impl;

import factory.simple.ICarProduct;

/**
 * 电动车工厂 实现车工厂 接口
 */
public class ElectrocarProduct implements ICarProduct {
    @Override
    public void doSomething() {
        System.out.println("ElectrocarProduct 生产电动车");
    }
}
