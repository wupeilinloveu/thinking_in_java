package java10_inner_class;

/**
 * 创建一个包含内部类的类，此内部类有一个非默认的构造器（需要参数的构造器）。
 * 创建另一个也包含内部类的类，此内部类继承自第一个内部类。
 * Created by Emily on 2021/9/28
 */
public class Test26 {
    public static void main(String[] args) {
        new Test26_C().new Test26_D(new Test26_A(20), 10);
    }
}
