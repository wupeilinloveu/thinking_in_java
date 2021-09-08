package java07_reuse_class;

/**
 * Created by Emily on 2021/9/26
 */
public class Test10_Root {
    Test10_Component1 t1 = new Test10_Component1("Root");
    Test10_Component2 t2 = new Test10_Component2("Root");
    Test10_Component3 t3 = new Test10_Component3("Root");
    public Test10_Root(String str) {
        System.out.println("Root " + str);
    }
}
