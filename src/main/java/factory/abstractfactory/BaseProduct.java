package factory.abstractfactory;

import factory.abstractfactory.fimpl.GolangFactory;
import factory.method.IProduct;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 基础产品
 */
public interface BaseProduct {
    void learn();
}
