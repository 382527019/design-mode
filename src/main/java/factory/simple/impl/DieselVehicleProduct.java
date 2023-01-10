package factory.simple.impl;

import factory.simple.ICarProduct;

/**
 * 柴油车工厂
 */
public class DieselVehicleProduct implements ICarProduct {
    @Override
    public void doSomething() {
        System.out.println("DieselVehicleProduct 生产柴油车");
    }
}
