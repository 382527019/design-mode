package factory.method.pimpl;

import factory.method.IProduct;
import factory.method.fimpl.GolangFactory;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GolangProduct extends GolangFactory implements IProduct {

    //描述
    private String describe;


    public GolangProduct(String describe) {
        this.describe=describe;
    }

    @Override
    public void doProduct() {
        System.out.println("细节："+this.Fdescribe+" --"+describe+"由："+this.getClass().getName());
    }


    @Override
    public void setFdescribe(String Fdescribe) {
        super.setFdescribe(Fdescribe);
    }
}
