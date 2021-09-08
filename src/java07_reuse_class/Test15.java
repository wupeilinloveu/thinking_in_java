package java07_reuse_class;

/**
 * 在包中编写一个类，类应具备一个protected方法。在包外部，
 * 试着调用该protected方法并解释其结果。然后，从你的类中继承产生
 * 一个类，并从该导出类的方法内部调用该protected方法。
 * Created by Emily on 2021/9/26
 */
public class Test15 {
    public static void main(String[] args) {
//        new Test15_Pro().f();
        new Test15_Derived().g();
    }
}
