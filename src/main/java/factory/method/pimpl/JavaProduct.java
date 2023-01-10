package factory.method.pimpl;

import factory.method.IProduct;
import factory.method.fimpl.JavaFactory;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created with IDEA
 * author:YunGui Hhuang
 * Date:2023/1/5
 * Time:23:30
 */
@Data
@NoArgsConstructor
public class JavaProduct extends JavaFactory implements IProduct {
    //描述
    private String describe;
    @Override
    public void doProduct() {
        System.out.println("细节："+this.Fdescribe+" --"+describe+"由："+this.getClass().getName());
    }

    public JavaProduct(String describe) {
        this.describe=describe;
    }


    @Override
    public void setFdescribe(String Fdescribe) {
        super.setFdescribe(Fdescribe);
    }
}
