package factory.simple;

/**
 * 简单工厂
 */
public class SimpleFactory {
    //生产不同类型的车
    public ICarProduct makeCarProduct(Class<? extends ICarProduct> clazz) {
        try {
            if (clazz != null) {
                return clazz.newInstance();
            }
        } catch (InstantiationException|IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
