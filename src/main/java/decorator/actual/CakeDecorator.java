package decorator.actual;

/**
 * Created with IDEA
 * author:YunGui Hhuang
 * Date:2023/3/6
 * Time:20:43
 */
public abstract class CakeDecorator extends Cake{

    private Cake cake;

    public CakeDecorator(Cake cake){
        this.cake= cake;
    }
    @Override
    public int getPrice() {
        return this.cake.getPrice();
    }

    @Override
    public String getMsg() {
        return this.cake.getMsg();
    }
}
