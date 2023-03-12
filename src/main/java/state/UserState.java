package state;

/**
 * 状态
 */
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
