# 原型模式

## 适用
1. 类初始化消耗资源多
2. new一个对象要繁琐的过程
3. 构造函数复杂
4. 循环体生产大量对象


### 浅克隆
克隆地址的引用
* Clonable接口并重写Object类的clone()方法，内部调用super.clone()
~~~
 @Override
    public Weapon clone() {
        try {
            Weapon clone = (Weapon) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
~~~
* The value of the refrence type of the copy object:[swing, read]
* The value of the refrence type of the original object:[swing, read]
* refrence Object address comparison:true

### 深克隆
新的对象
* 实现接口 implements Serializable,Cloneable
* refrence Object address comparison:false
~~~
    @Override
   public Object clone() { 
      X x = new X(name, subj.getName()); 
      return x; 
   } 

~~~
### 区别
* 浅拷贝增加了一个指针指向已经存在的内存
* 深拷贝就是增加一个指针并且申请一个新的内存，新指针指向新内存
* 采用深拷贝，**释放内存时，不会出现重复释放同一内存的错误**