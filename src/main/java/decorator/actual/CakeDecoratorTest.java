package decorator.actual;

public class CakeDecoratorTest {

    public static void main(String[] args) {
        Cake cake = new BaseCake();
        System.out.println(cake.getMsg()+"总价/元"+cake.getPrice());

        EggCake eggCake = new EggCake(cake);
        System.out.println(eggCake.getMsg()+"总价/元"+eggCake.getPrice());

        SausageCake sausageCake = new SausageCake(cake);
        System.out.println(sausageCake.getMsg()+"总价/元"+sausageCake.getPrice());

        SausageCake sausageAndEggCake = new SausageCake(eggCake);
        System.out.println(sausageAndEggCake.getMsg()+"总价/元"+sausageAndEggCake.getPrice());

        /*
            饼5元总价/元5
            饼5元加鸡蛋2元总价/元7
            饼5元加香肠1元总价/元6
            饼5元加鸡蛋2元加香肠1元总价/元8
            */
    }
}
