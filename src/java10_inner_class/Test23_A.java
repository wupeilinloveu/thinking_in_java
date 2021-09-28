package java10_inner_class;

/**
 * Created by Emily on 2021/9/28
 */
public class Test23_A {
    String name;

    public Test23_A(String name) {
        this.name = name;
    }

    public Test23_U getU() {
        return new Test23_U() {

            @Override
            public void f() {
                System.out.println(name + "f()");
            }

            @Override
            public void g() {
                System.out.println(name + "g()");
            }

            @Override
            public void h() {
                System.out.println(name + "h()");
            }
        };
    }
}
