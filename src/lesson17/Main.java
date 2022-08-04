package lesson17;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ParamClass<String> stringParamClass = new ParamClass<>("qwe");
        stringParamClass.printVal();

        System.out.println();

        ParamClass<Integer> paramClass = new ParamClass<>(123);
        paramClass.printVal();

        System.out.println();

        ParamMetod paramMetod = new ParamMetod(321);
        var t =paramMetod.printTest("qwe");
        var t1 =paramMetod.printTest(123.2);
        System.out.println(t);

        paramMetod.printKV(132.2,321);
    }
}
