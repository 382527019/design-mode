# 原型模式

## 适用
1. 类初始化消耗资源多
2. new一个对象要繁琐的过程
3. 构造函数复杂
4. 循环体生产大量对象


### 浅克隆
克隆地址的引用
* The value of the refrence type of the copy object:[swing, read]
* The value of the refrence type of the original object:[swing, read]
* refrence Object address comparison:true

### 深克隆
新的对象
* 实现接口 implements Serializable,Cloneable
* refrence Object address comparison:false