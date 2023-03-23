package chainofresponsibility.chain;

/**
 *
 */
public class MemberService {
    public void login(String name,String password){
        Handler validateHandler = new ValidateHandler();
        LoginHandler loginHandler = new LoginHandler();
        AuthHandler authHandler = new AuthHandler();

        validateHandler.next(loginHandler);
        loginHandler.next(authHandler);
        validateHandler.doHandler(new Member(name,password));
    }

    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        memberService.login("admin","admin");
    }
}
