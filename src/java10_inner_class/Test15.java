package java10_inner_class;

/**
 * 创建一个类，它有非默认的构造器（既需要参数的构造器），并且没有默认构造器（没有无参数的构造器）。
 * 创建第二个类，它包含一个方法，能够返回对第一个类的对象的引用。通过写一个继承自第一个类的匿名内部类，来创建一个返回对象。
 * Created by Emily on 2021/9/28
 */
public class Test15 {
    public Test15_Str getStr(String name) {
        return new Test15_Str(name) {//继承自Test15_Str
            void f() {
                System.out.println("extends");
            }
        };
    }
}
