package java07_reuse_class;

/**
 * 创建一个类，它应带有一个被重载了三次的方法。继承产生一个新类，
 *  并添加一个该方法的新的重载定义，展示这四个方法在导出类中都是可以使用的。
 * Created by Emily on 2021/9/26
 */
public class Test13 extends Test13_Animal{
    public void eat(double d) {
        System.out.println("eat double...");
    }

    public static void main(String[] args) {
        Test13 e = new Test13();
        e.eat();
        e.eat("hello");
        e.eat(80);
        e.eat(2.5);
    }
}
