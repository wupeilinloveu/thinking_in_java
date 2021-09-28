package java10_inner_class;

/**
 * 创建一个包含嵌套类的类。在main()中创建起内部类的实例。
 * Created by Emily on 2021/9/28
 */
public class Test18 {
    static class StaticInner {//静态内部类又称为嵌套类
        private int anInt = 10;

        private void f() {
            System.out.println("Static inner class created");
        }
    }

    public static void main(String[] args) {
        StaticInner staticInner = new StaticInner();
        //嵌套类不需要外部类的引用即可创建
    }
}
