package java07_reuse_class;

/**
 * 展示@Override注解可以解决本节中的问题。
 * Created by Emily on 2021/9/26
 */
public class Test20 {
    public static void main(String[] args) {
        Test20_OverridingPrivate2 op2 = new Test20_OverridingPrivate2();
        op2.f();
        op2.g();
    }
}
