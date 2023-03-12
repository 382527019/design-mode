# 迭代器模式
* 提供一种顺序访问集合的方法（无须暴露集合内部）
* 提供遍历不同结构集合的统一接口
---
集合内定义的迭代器接口
~~~
public interface IAggregate<E> {

    void add(E e);

    void remove(E e);

    E get(int index);

    /*集合的迭代器*/
    Iterator<E> iterator();
}
~~~
main
~~~
 public static void main(String[] args) {
        ConcreteAggregate<String> aggregate = new ConcreteAggregate<String>();
        aggregate.add("1");
        aggregate.add("2");
        aggregate.add("3");
        aggregate.add("4");
        aggregate.add("5");

        Iterator<String> iterator = aggregate.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
    }
~~~
![image](https://user-images.githubusercontent.com/64847551/224532489-aa4346fa-8f22-4c68-ab0a-68a653c952df.png)
