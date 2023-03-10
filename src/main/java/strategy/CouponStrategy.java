package strategy;

/**
 * Created with IDEA
 * author:YunGui Hhuang
 * Date:2023/3/10
 * Time:13:43
 */
public class CouponStrategy implements IPromotionStrategy {
    @Override
    public void promotionAct() {
        System.out.println("优惠券");
    }
}
