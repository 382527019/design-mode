package chainofresponsibility;



/**
 * 校验处理
 */
public class LoginHandler extends Handler {
    @Override
    public void doHandler(Member member) {
        System.out.println("登录成功");
        member.setRole("admin");
        System.out.println(this.getClass().getName()+"处理通过");
        this.chain.doHandler(member);
    }
}
