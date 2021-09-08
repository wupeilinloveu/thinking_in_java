package java_initialize_and_cleanup;

/**
 * 创建一个类，它有一个接受一个String参数的构造器。在构造阶段，打印该参数。
 * 创建一个该类的对象引用数组，但是不实际去创建对象赋值给该数组。
 * 当运行程序时，请注意来自对该构造器的调用中的初始化消息是否打印了出来。
 * Created by Emily on 2021/9/8
 */
public class Test17 {
    Test[] arr1 = new Test[5];

    public static void main(String[] args) {
        Test[] arr2 = new Test[5];
    }
}
class Test {
    public Test(String s) {
        System.out.println("字符串的构造器  s = " + s);
    }
}
