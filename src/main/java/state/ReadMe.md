# 状态模式
* 对象在内部状态改变时行为也改变
* 一个操作有很多分支结构，分支由状态决定
---

* 状态要在环境上下文中切换
  * 定义拥有的动作
~~~

public abstract class UserState {

    /*状态通过环境上下文切换*/
    protected AppContext context;
    /*收藏*/
    public abstract void favorite();

    /*评论*/
    public abstract void comment(String comment);

    public AppContext getContext() {
        return context;
    }

    public void setContext(AppContext context) {
        this.context = context;
    }
}
~~~

* 定义不同状态对应不同动作
  * 环境切换状态`this.context.setUserState(AppContext.LOGIN_STATE);`
~~~
public class LoginState extends UserState {
    @Override
    public void favorite() {
        System.out.println("收藏成功");
    }

    @Override
    public void comment(String comment) {
        System.out.println("评论:"+comment);
    }
}
~~~
* 不同状态不同动作
~~~
public class UnLoginState extends UserState {
    @Override
    public void favorite() {
        this.switchLogin();
        this.context.getUserState().favorite();
    }

    @Override
    public void comment(String comment) {
        this.switchLogin();
        this.context.getUserState().comment(comment);
    }

    /**
     * 环境上下文切换状态
     *
     * */
    private void switchLogin(){
        System.out.println("转跳 - 》登录");
        this.context.setUserState(AppContext.LOGIN_STATE);
    }
}
~~~

* 环境上下文
~~~
public class AppContext {

    public static final UserState LOGIN_STATE = new LoginState();
    public static final UserState UN_LOGIN_STATE = new UnLoginState();
    private UserState userState;

    public AppContext(UserState userState){
        this.userState = userState;
    }

    {
        LOGIN_STATE.setContext(this);
        UN_LOGIN_STATE.setContext(this);
    }

    public void favorite() {
        this.userState.favorite();
    }

    public void comment(String comment) {
        this.userState.comment(comment);
    }

    public UserState getUserState() {
        return userState;
    }

    public void setUserState(UserState userState) {
        this.userState = userState;
    }
}
~~~

* main
~~~
public class StateTest {
    public static void main(String[] args) {
        AppContext appContext = new AppContext(AppContext.UN_LOGIN_STATE);
        appContext.favorite();
        appContext.comment("评价ing");
        /*  转跳 - 》登录
            收藏成功
            评论:评价ing
            Disconnected */
    }
}
~~~