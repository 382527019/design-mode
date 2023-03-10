package chainofresponsibility.chain;



/**
 * 校验处理
 */
public class LoginHandler extends Handler {
    @Override
    public void doHandler(Member member) {

        member.setRole("admin");
        System.out.println(this.getClass().getName()+"登录成功_处理通过");
        this.chain.doHandler(member);
    }
}
