package strategy;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created with IDEA
 * author:YunGui Hhuang
 * Date:2023/3/10
 * Time:13:54
 */
public class StrategyFactory {

    private static Map<String, IPromotionStrategy> tpyeMap = new HashMap<>();

    private static final IPromotionStrategy emptyStrategy = new EmptyStrategy();

    static {
        tpyeMap.put(PromotionKey.Empty, new EmptyStrategy());
        tpyeMap.put(PromotionKey.Coupon, new CouponStrategy());
        tpyeMap.put(PromotionKey.Cashback, new CashbackStrategy());
    }

    private StrategyFactory() {

    }

    /*按key获取策略实现类*/
    public static IPromotionStrategy getStrategy(String type){
        IPromotionStrategy iPromotionStrategy = tpyeMap.get(type);
        return iPromotionStrategy==null?emptyStrategy:iPromotionStrategy;
    }

    /*拿所有策略key*/
    public static List<String> getPromotionKey(){
        return new ArrayList<>(tpyeMap.keySet());
    }

    private interface PromotionKey{
        String Empty = "Empty";
        String Coupon = "Coupon";
        String Cashback = "Cashback";
    }

    public static void main(String[] args) {
        List<String> promotionKey = StrategyFactory.getPromotionKey();
        IPromotionStrategy strategy = StrategyFactory.getStrategy(promotionKey.get(new Random().nextInt(3)));
        strategy.promotionAct();
    }
}
