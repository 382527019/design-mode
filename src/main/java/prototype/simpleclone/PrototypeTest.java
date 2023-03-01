package prototype.simpleclone;

import prototype.simpleclone.Client;
import prototype.simpleclone.CreatePrototypeA;

import java.util.Arrays;

/**
 * Created with IDEA
 * author:YunGui Hhuang
 * Date:2023/3/1
 * Time:15:22
 */
public class PrototypeTest {

    public static void main(String[] args) {
        CreatePrototypeA createPrototype = new CreatePrototypeA();
        createPrototype.setAge(18);
        createPrototype.setName("me-name");
        createPrototype.setHobbies(Arrays.asList("swing","read"));

        Client client = new Client();
        CreatePrototypeA copy = (CreatePrototypeA)client.startClone(createPrototype);

        System.out.println("The value of the refrence type of the copy object:"+copy.getHobbies());//[swing, read]
        System.out.println("The value of the refrence type of the original object:"+copy.getHobbies());//[swing, read]

        System.out.println("refrence Object address comparison:" + (copy.getHobbies()==createPrototype.getHobbies()));//true

    }
}
