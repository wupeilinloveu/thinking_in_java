package java10_inner_class;

/**
 * 创建一个包含内部类的类，在另一个独立的类中，创建此内部类的实例。
 * Created by Emily on 2021/9/27
 */
public class Test05 {
    public static void main(String[] args) {
        Test05_Bird bird = new Test05_Bird();
        Test05_Bird.Fly fly = bird.new Fly();//必须有外部类的实例才能创建内部类
    }
}
