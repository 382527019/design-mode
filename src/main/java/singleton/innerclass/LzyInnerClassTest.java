package singleton.innerclass;

import java.lang.reflect.Constructor;

/**
 *
 */
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
