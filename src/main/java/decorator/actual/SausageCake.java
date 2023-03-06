package decorator.actual;

/**
 * Created with IDEA
 * author:YunGui Hhuang
 * Date:2023/3/6
 * Time:20:40
 */
public class SausageCake extends CakeDecorator{

    public SausageCake(Cake cake) {
        super(cake);
    }

    @Override
    public int getPrice() {
        return super.getPrice()+1;
    }

    @Override
    public String getMsg() {
        return super.getMsg()+"加香肠1元";
    }
}
