package prototype.simpleclone;

import java.util.List;

/**
 * Created with IDEA
 * author:YunGui Hhuang
 * Date:2023/3/1
 * Time:15:19
 */
public class CreatePrototypeA implements Prototype {

    private String name;
    private int age;
    private List<String> hobbies;


    /**
     * 克隆
     * @return
     */
    @Override
    public Prototype clone() {
        CreatePrototypeA createPrototype = new CreatePrototypeA();
        createPrototype.setAge(this.age);
        createPrototype.setName(this.name);
        createPrototype.setHobbies(this.hobbies);
        return createPrototype;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }
}
