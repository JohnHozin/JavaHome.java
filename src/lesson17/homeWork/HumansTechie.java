package lesson17.homeWork;

public class HumansTechie <T> implements Humans{
    private T t;
    private String name;
    private int age;
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age=age;
    }
}
