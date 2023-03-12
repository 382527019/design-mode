package state;

/**
 * Created with IDEA
 * author:YunGui Hhuang
 * Date:2023/3/12
 * Time:23:15
 */
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
