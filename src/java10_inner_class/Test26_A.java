package java10_inner_class;

/**
 * Created by Emily on 2021/9/28
 */
public class Test26_A {
    int a;

    Test26_A(int a) {
        this.a = a;
    }

    class Test26_B {
        int b;

        Test26_B(int b) {
            this.b = b;
            System.out.println("Test26_A = " + a);
        }
    }
}
