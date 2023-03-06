package decorator.actual;

/**
 * Created with IDEA
 * author:YunGui Hhuang
 * Date:2023/3/6
 * Time:20:40
 */
public class EggCake extends CakeDecorator{

    public EggCake(Cake cake) {
        super(cake);
    }

    @Override
    public int getPrice() {
        return super.getPrice()+2;
    }

    @Override
    public String getMsg() {
        return super.getMsg()+"加鸡蛋2元";
    }
}
