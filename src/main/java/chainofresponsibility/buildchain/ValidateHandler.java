package chainofresponsibility.buildchain;


import chainofresponsibility.chain.Handler;
import chainofresponsibility.chain.Member;

/**
 * 校验处理
 */
public class ValidateHandler extends BuildHandler {
    @Override
    public void doHandler(Member member) {
        if (member.getName()==null||member.getPassword()==null){
            System.out.println("账户或密码为空");
            return;
        }
        System.out.println(this.getClass().getName()+"校验"+"_处理通过");
        this.doFilter(member);
    }
}
