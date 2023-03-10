package chainofresponsibility.buildchain;


import chainofresponsibility.chain.Handler;
import chainofresponsibility.chain.Member;

/**
 * 校验处理
 */
public class AuthHandler extends BuildHandler {
    @Override
    public void doHandler(Member member) {
        if (!member.getRole().equals("admin")){
            System.out.println("不是admin，不通过");
            return;
        }
        System.out.println(this.getClass().getName()+"认证_处理通过");
        this.doFilter(member);
    }

}
