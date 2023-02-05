###4.静态内部类-单例
* 解决内存浪费问题和锁的性能问题

~~~
public class LazyInnerClass {
    //默认先加载内部类
    private LazyInnerClass(){}
    //static 保证该方法不重写、重载
    private static LazyInnerClass getInstance(){
        return LazyHolder.instance;
    }
    //Java默认不加载内部类
    private static class LazyHolder{
        private static final LazyInnerClass instance = new LazyInnerClass();
        
    }
}
~~~

* 反射调用破坏 强制访问
~~~
  public class LzyInnerClassTest {
    public static void main(String[] args) {
        try {
            Class<LazyInnerClass> aClass = LazyInnerClass.class;
            Constructor<LazyInnerClass> constructor = aClass.getDeclaredConstructor(null);
            //强制访问 private =》setAccessible
            constructor.setAccessible(true);
            LazyInnerClass lazyInnerClass = constructor.newInstance();
            LazyInnerClass lazyInnerClass1 = constructor.newInstance();
            if (lazyInnerClass1!=lazyInnerClass)
            System.out.println("两个不是同一个实例");
            else
                System.out.println("两个是同一个实例");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
~~~

~~~
两个不是同一个实例
~~~

* 抛异常处理反射强制访问问题
~~~
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

~~~