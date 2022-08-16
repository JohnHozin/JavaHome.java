package lesson17.homeWork;

public class HumansHumanitarian <H> implements Humans{
    private H h;
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
