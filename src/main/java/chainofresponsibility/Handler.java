package chainofresponsibility;

/**
 * 处理器处理请求
 */
public abstract class Handler {
    protected Handler chain;

    public void next(Handler handler){
        this.chain = handler;
    }
    /*处理抽象方法*/
    public abstract void doHandler(Member member);
}
