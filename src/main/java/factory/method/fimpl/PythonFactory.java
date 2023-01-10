package factory.method.fimpl;

import factory.method.IFactory;
import factory.method.IProduct;
import factory.method.pimpl.PythonProduct;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created with IDEA
 * author:YunGui Hhuang
 * Date:2023/1/5
 * Time:23:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PythonFactory implements IFactory {
    //描述
    protected String Fdescribe;
    @Override
    public IProduct create() {
        PythonProduct pythonProduct = new PythonProduct("python");
        pythonProduct.setFdescribe(this.Fdescribe);
        return pythonProduct;
    }

}
