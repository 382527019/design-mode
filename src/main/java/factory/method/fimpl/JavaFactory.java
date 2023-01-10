package factory.method.fimpl;

import factory.method.IFactory;
import factory.method.IProduct;
import factory.method.pimpl.JavaProduct;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JavaFactory implements IFactory {
    //描述
    protected String Fdescribe;

    @Override
    public IProduct create() {
        JavaProduct javaProduct = new JavaProduct("java");
        javaProduct.setFdescribe(this.Fdescribe);
        return javaProduct;
    }
}
