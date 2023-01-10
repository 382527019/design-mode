package factory.simple;

import factory.simple.impl.DieselVehicleProduct;
import factory.simple.impl.ElectrocarProduct;
import factory.simple.impl.GasolineCarProduct;

/**
 * Created with IDEA
 * author:YunGui Hhuang
 * Date:2023/1/3
 * Time:22:50
 */
public class ClientMain {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        ICarProduct electrocarProduct = simpleFactory.makeCarProduct(ElectrocarProduct.class);
        electrocarProduct.doSomething();
        ICarProduct gasolineCarProduct = simpleFactory.makeCarProduct(GasolineCarProduct.class);
        gasolineCarProduct.doSomething();
        ICarProduct dieselVehicleProduct = simpleFactory.makeCarProduct(DieselVehicleProduct.class);
        dieselVehicleProduct.doSomething();
    }
}
