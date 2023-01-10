package factory.method.fimpl;

import factory.method.IFactory;
import factory.method.IProduct;
import factory.method.pimpl.GolangProduct;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GolangFactory implements IFactory {
    //描述
    protected String Fdescribe;

    @Override
    public IProduct create() {
        GolangProduct golangProduct = new GolangProduct("golang");
        golangProduct.setFdescribe(this.Fdescribe);
        return golangProduct;
    }
}
