package java07_reuse_class;

/**
 * Created by Emily on 2021/9/26
 */
public class Test20_OverridingPrivate extends Test20_WithFinals{
    private final void f() {
        System.out.println("OverridingPrivate.f()");
    }
    public void g() {
        System.out.println("OverridingPrivate.g()");
    }
}
