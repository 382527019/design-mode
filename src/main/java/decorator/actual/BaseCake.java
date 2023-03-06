package decorator.actual;

/**
 * Created with IDEA
 * author:YunGui Hhuang
 * Date:2023/3/6
 * Time:20:40
 */
public class BaseCake extends Cake{

    @Override
    public int getPrice() {
        return 5;
    }

    @Override
    public String getMsg() {
        return "饼5元";
    }
}
