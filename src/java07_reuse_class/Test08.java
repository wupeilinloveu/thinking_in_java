package java07_reuse_class;

/**
 * 创建一个基类，它仅有一个非默认构造器；再创建一个导出类，
 * 它带有默认构造器和非默认构造器。在导出类的构造器中调用基类的构造器。
 * Created by Emily on 2021/9/26
 */
public class Test08 extends Test08_Base{
    public Test08() {
        super(2);
    }

    public Test08(int i) {
        super(i);
    }

    public static void main(String[] args) {
        new Test08();
        new Test08(8);
    }
}
