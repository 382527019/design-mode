package chainofresponsibility.buildchain;

import chainofresponsibility.chain.Member;

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
