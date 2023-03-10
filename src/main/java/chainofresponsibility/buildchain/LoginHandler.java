package chainofresponsibility.buildchain;


import chainofresponsibility.chain.Handler;
import chainofresponsibility.chain.Member;

/**
 * 校验处理
 */
public class LoginHandler extends BuildHandler {
    @Override
    public void doHandler(Member member) {
        member.setRole("admin");
        System.out.println(this.getClass().getName()+"登录成功_处理通过");
        this.doFilter(member);
    }
}
