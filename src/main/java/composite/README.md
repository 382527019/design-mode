# 组合模式

* 抽离出对象一致行为，让客户端忽略组合和个体的差异
* 树形结构

### 透明组合transparent
* 抽象组件，把行为抽象定义
~~~
/*
    * 所有一致操作都定义到抽象类上
    * */
public abstract class CourseComponent
~~~
* 叶子节点，存储信息
~~~
public class Course extends CourseComponent
~~~
* 树枝节点，存储层次（包）信息
~~~
public class CoursePackage extends CourseComponent
~~~
### 安全组合
* 定义的接口职责清晰
* 缺：需要区分叶子节点和树枝节点
~~~
public abstract class CourseComponent {

    protected String name;
    protected double price;

    public CourseComponent(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract void print();
}
~~~
