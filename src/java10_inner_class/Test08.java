package java10_inner_class;

/**
 * 确定外部类是否可以访问其内部类的private元素。
 * Created by Emily on 2021/9/27
 */
public class Test08 {
    class Inner {
        private int count;
    }

    void add() {
        Inner inner = new Inner();
        inner.count++;
        System.out.println(inner.count);
    }

    public static void main(String[] args) {
        Test08 t = new Test08();
        t.add();
    }
}
