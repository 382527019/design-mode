# 责任链模式
* 使用者只需将请求发送到链上即可，**不需关心请求的具体内容和处理**
* 发一个请求，多个对象处理，由运行时状态决定具体处理对象。
---
* 抽象处理者（Handler）
~~~Java
public abstract class Handler {
    protected Handler chain;

    public void next(Handler handler){
        this.chain = handler;
    }
    /*处理抽象方法*/
    public abstract void doHandler(Member member);
}
~~~
* 具体处理者（ConcreteHandler）
~~~Java
public class AuthHandler extends Handler {
    @Override
    public void doHandler(Member member) {
        if (!member.getRole().equals("admin")){
            System.out.println("不是admin，不通过");
            return;
        }
        System.out.println(this.getClass().getName()+"认证_处理通过");
    }
}
~~~


### 链式构建责任链
~~~Java
public class BuildMemberService {

    public void login(String name,String password){
       BuildHandler build = new BuildHandler.Builder()
                .addBuilderHandler(new ValidateHandler())
                .addBuilderHandler(new LoginHandler())
                .addBuilderHandler(new AuthHandler())
                .build();
        build.doHandler(new Member(name,password));
    }

    public static void main(String[] args) {
        BuildMemberService buildMemberService = new BuildMemberService();
        buildMemberService.login("admin","admin");
    }
}
~~~
登录请求doHandler操作
~~~Java
/**
 * 处理器处理请求
 */
public abstract class BuildHandler {
    /*链*/
    protected BuildHandler chain;

    private void next(BuildHandler handler) {
        this.chain = handler;
    }


    /*处理抽象方法*/
    public abstract void doHandler(Member member);

    /*放行处理下一个责任对象*/
    public void doFilter(Member member){
        if (this.chain == null) {
            return;
        }
        this.chain.doHandler(member);
    }

    static class Builder {
        private BuildHandler head;
        private BuildHandler tail;

        /*组织链式结构 a-b-c-d*/
        public Builder addBuilderHandler(BuildHandler buildHandler) {
            if (head == null) {
                this.head = this.tail = buildHandler;
                return this;
            }
            /*链式连接 尾插*/
            this.tail.next(buildHandler);
            this.tail = buildHandler;
            return this;
        }

        public BuildHandler build() {
            return this.head;
        }
    }
}

~~~
![image](https://user-images.githubusercontent.com/64847551/227138102-64295c16-0f0c-4744-a9ca-596c1bd1cf15.png)

