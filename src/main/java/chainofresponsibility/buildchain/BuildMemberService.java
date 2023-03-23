package chainofresponsibility.buildchain;


import chainofresponsibility.chain.Member;

/**
 * 链式构建
 */
public class BuildMemberService {

    public void login(String name,String password){
        BuildHandler build = new BuildHandler.Builder()
                .addBuilderHandler(new ValidateHandler())
                .addBuilderHandler(new LoginHandler())
                .addBuilderHandler(new AuthHandler())
                .build();
        build.doHandler(new Member(name,password));
    }

    public static void main(String[] args) {
        BuildMemberService buildMemberService = new BuildMemberService();
        buildMemberService.login("admin","admin");
    }
}
