package java07_reuse_class;

/**
 * Created by Emily on 2021/9/26
 */
public class Test12_Stem extends Test12_Root{
    Test12_Component1 t1 = new Test12_Component1();
    Test12_Component2 t2 = new Test12_Component2();
    Test12_Component3 t3 = new Test12_Component3();
    public Test12_Stem() {
        super();
        System.out.println("Stem");
    }
    public void dispose() {
        System.out.println("Stem dispose");
        t1.dispose();
        t2.dispose();
        t3.dispose();
        super.dispose();
    }
}
