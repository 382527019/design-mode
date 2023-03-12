package state;

/**
 * Created with IDEA
 * author:YunGui Hhuang
 * Date:2023/3/12
 * Time:23:07
 */
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
