package strategy;

/**
 * Created with IDEA
 * author:YunGui Hhuang
 * Date:2023/3/10
 * Time:13:43
 */
public class EmptyStrategy implements IPromotionStrategy {
    @Override
    public void promotionAct() {
        System.out.println("无优惠");
    }
}
