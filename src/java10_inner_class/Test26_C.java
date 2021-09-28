package java10_inner_class;

/**
 * Created by Emily on 2021/9/28
 */
public class Test26_C {
    class Test26_D extends Test26_A.Test26_B {
        Test26_D(Test26_A e, int b) {
            e.super(b);
            System.out.println("Test26_D = " + b);
        }
    }
}
