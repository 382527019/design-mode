package builder;

import lombok.Data;

/**
 * Created with IDEA
 * author:YunGui Hhuang
 * Date:2023/3/1
 * Time:17:24
 */
@Data
public class HumanBuilder {

    private String name;
    private String age;

    public HumanBuilder(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
    }
    public HumanBuilder(){
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
