package java10_inner_class;

/**
 * 编写一个名为Outer的类，它包含一个名为Inner的类。在Outer中添加一个方法，它返回一个Inner类型的对象。
 * 在main()中，创建并初始化一个指向某个Inner对象的引用。
 * Created by Emily on 2021/9/27
 */
public class test01 {
    class Inner {
    }

    public Inner getInner() {
        return new Inner();
    }

    public static void main(String[] args) {
        test01 test01 = new test01();
        Inner i = test01.getInner();
    }
}
