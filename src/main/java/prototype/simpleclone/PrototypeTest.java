package prototype.simpleclone;

import java.util.Arrays;

/**
 * 原型
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
