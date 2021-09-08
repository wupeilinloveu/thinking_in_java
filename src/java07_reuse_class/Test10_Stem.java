package java07_reuse_class;

/**
 * Created by Emily on 2021/9/26
 */
public class Test10_Stem extends Test10_Root{
    Test10_Component1 t1 = new Test10_Component1("Stem");
    Test10_Component2 t2 = new Test10_Component2("Stem");
    Test10_Component3 t3 = new Test10_Component3("Stem");
    public Test10_Stem(String str) {
        super(str);
        System.out.println("Stem " + str);
    }
}
