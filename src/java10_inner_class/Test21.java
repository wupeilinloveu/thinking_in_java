package java10_inner_class;

/**
 * 创建一个包含嵌套类的接口，该嵌套类中有一个static方法，它将调用接口中的方法并显示结果。
 * 实现这个接口，并将这个实现的一个实例传递给这个方法。
 * Created by Emily on 2021/9/28
 */
public class Test21 implements Test21_Dog {
    @Override
    public void bite() {
        System.out.println("Test21");
    }

    public static void main(String[] args) {
        action w = new action();
        w.f();
    }
}
