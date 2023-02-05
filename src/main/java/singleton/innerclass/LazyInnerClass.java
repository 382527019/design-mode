package singleton.innerclass;

/**
 *
 */
public class LazyInnerClass {
    //默认先加载内部类
    private LazyInnerClass(){
        if (LazyHolder.instance!=null){
            throw new RuntimeException("不允许创建多个实例");
        }
    }
    //static 保证该方法不重写、重载
    private static LazyInnerClass getInstance(){
        //返回前加载内部类
        return LazyHolder.instance;
    }
    //Java默认不加载内部类
    private static class LazyHolder{
        private static final LazyInnerClass instance = new LazyInnerClass();

    }
}
