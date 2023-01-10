package factory.method;

import factory.method.IFactory;
import factory.method.fimpl.GolangFactory;
import factory.method.fimpl.JavaFactory;
import factory.method.fimpl.PythonFactory;

/**
 * Created with IDEA
 * author:YunGui Hhuang
 * Date:2023/1/5
 * Time:23:53
 */
public class ClienMain {

    public static void main(String[] args) {
        IFactory golangFactory = new GolangFactory("创建golang工厂");
        golangFactory.create().doProduct();

        IFactory javaFactory = new JavaFactory("创建java工厂");
        javaFactory.create().doProduct();

        IFactory pythonFactory = new PythonFactory("创建python工厂");
        pythonFactory.create().doProduct();

    }
}
