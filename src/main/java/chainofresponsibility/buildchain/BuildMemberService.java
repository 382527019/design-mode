package chainofresponsibility.buildchain;


import chainofresponsibility.chain.Member;

/**
 * Created with IDEA
 * author:YunGui Hhuang
 * Date:2023/3/10
 * Time:22:48
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
