package java10_inner_class;

/**
 * 重复练习7，这次使用匿名内部类。
 * Created by Emily on 2021/9/28
 */
public class Test12 {
    private int num = 5;

    private void add() {
        num++;
    }

    public Test12_Interface anInterface() {
        return new Test12_Interface() {
            @Override
            public void change() {
                num++;
                add();
            }
        };
    }

    public void anotherM() {
        Test12_Interface a = anInterface();
        a.change();
    }

    public static void main(String[] args) {
        Test12 t = new Test12();
        t.anotherM();
        System.out.println("num" + t.num);
    }
}
