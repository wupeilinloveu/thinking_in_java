package java10_inner_class;

/**
 * Created by Emily on 2021/9/26
 */
public class Test13 {
    public Test13_Interface setInterface() {
        return new Test13_Interface() {
            @Override
            public void method() {
                System.out.println("success");
            }
        };
    }

    public static void main(String[] args) {
        Test13 t = new Test13();
        t.setInterface().method();
    }
}
