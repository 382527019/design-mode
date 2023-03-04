package proxy.dynamic.cglibproxy;

import lombok.Data;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import proxy.Iperson;

import java.lang.reflect.Method;

/**
 * Created with IDEA
 * author:YunGui Hhuang
 * Date:2023/3/3
 * Time:18:25
 */
@Data
public class CglibproxyClient implements MethodInterceptor {

    public Object getInstance(final Class<?> clazz){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib.. start proxy");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("cglib.. end proxy");
        return result;
    }
}
