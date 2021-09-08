package java07_reuse_class;

/**
 * Created by Emily on 2021/9/26
 */
public class Test09_Root {
    Test09_Component1 t1 = new Test09_Component1();
    Test09_Component2 t2 = new Test09_Component2();
    Test09_Component3 t3 = new Test09_Component3();
    public Test09_Root() {
        System.out.println("Root");
    }
}
