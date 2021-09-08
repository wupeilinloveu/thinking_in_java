package java07_reuse_class;

/**
 * Created by Emily on 2021/9/26
 */
public class Test07_C extends Test07_A{
    Test07_B b;
    public Test07_C(String str) {
        super(str);
        b = new Test07_B(str);
    }
}
