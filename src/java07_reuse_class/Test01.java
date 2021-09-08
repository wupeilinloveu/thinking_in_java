package java07_reuse_class;

/**
 * 创建一个简单的类。在第二个类中，将一个引用定义为第一个类的对象。运用惰性初始化来实例化这个对象。
 * Created by Emily on 2021/9/23
 */
public class Test01 {
    public static void main(String[] args) {
        Test01_Second second = new Test01_Second("Init String");
        second.check();
        System.out.println(second.getSimple());
        second.check();
        System.out.println(second);
        second.setSimple("New String");
        System.out.println(second);
    }
}
