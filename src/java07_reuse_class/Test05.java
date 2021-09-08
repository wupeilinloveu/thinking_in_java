package java07_reuse_class;

/**
 * 创建两个带有默认构造器（空参数列表）的类A和类B。
 * 从A中继承产生一个名为C的新类，并在C内创建一个B类的成员。
 * 不要给C编写构造器。创建一个C类的对象并观察其结果。
 * Created by Emily on 2021/9/26
 */
public class Test05 {
    public static void main(String[] args) {
        new Test05_C();
    }
}
