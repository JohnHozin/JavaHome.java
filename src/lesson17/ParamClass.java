package lesson17;

public class ParamClass<T> {
    private T t;

    public ParamClass(T t) {
        this.t = t;
    }

    public void printVal(){
        System.out.println(t);
    }



}
