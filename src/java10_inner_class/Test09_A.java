package java10_inner_class;

/**
 * Created by Emily on 2021/9/27
 */
public class Test09_A {
    public Test09_Inter inter() {
        class Test09_B implements Test09_Inter {
            public void func() { System.out.println("Test09_B.func()"); }
        }
        return new Test09_B();
    }
}
