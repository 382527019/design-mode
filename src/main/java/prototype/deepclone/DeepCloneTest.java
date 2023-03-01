package prototype.deepclone;

/**
 * Created with IDEA
 * author:YunGui Hhuang
 * Date:2023/3/1
 * Time:16:29
 */
public class DeepCloneTest {

    public static void main(String[] args) {
        Hero hero = new Hero();
        Hero clone = hero.clone();
        System.out.println("original object address:"+hero);// prototype.deepclone.Hero@4b67cf4d
        System.out.println("copy object address:"+clone);// prototype.deepclone.Hero@27d6c5e0
        System.out.println("deep getWeapon clone obj = copy:"+(hero.getWeapon()==clone.getWeapon()));//false
    }
}
