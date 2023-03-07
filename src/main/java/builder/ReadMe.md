# 建造者模式
将复杂对象和它的表示分类，让同样的构建过程可以创建不同的表示

* 链式建造者
~~~
@Data
public class HumanBuilder {
    private String name;
    private String age;
    
    public HumanBuilder(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
    }

    @Data
    static class Builder{
        private String name;
        private String age;

        public Builder name(String name) {
            this.name = name;
            return this;

        }
        public Builder age(String age) {
            this.age = age;
            return this;
        }

        public HumanBuilder build() {
            return new HumanBuilder(this);
        }
    }
}

~~~
* 调用
~~~
        HumanBuilder human = new HumanBuilder.Builder().age("18").name("name").build();
~~~
