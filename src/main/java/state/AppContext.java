package state;

/**
 * 环境上下文
 */
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
