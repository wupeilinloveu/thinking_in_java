package java10_inner_class;

/**
 * 在第一个包中创建一个至少有一个方法的接口。然后在第二个包内创建一个类，
 * 在其中增加一个protected的内部类以实现那个接口。在第三个包中，继承这个类，
 * 并在一个方法中返回该protected内部类对象，在返回的时候向上转型为第一个包中的接口的类型。
 * Created by Emily on 2021/9/27
 */
public class Test06 {
    public static void main(String[] args) {
        new Test06_ExtendedClass().getInner().show();
    }
}
