package java_initialize_and_cleanup;

/**
 * 创建一个没有构造器的类，并在main（）中创建其对象，用以验证编译器是否真的自动加入了默认构造器。
 * Created by Emily on 2021/9/8
 */
public class Test07 {
    static String str;
    public static void main(String[] args) {
        System.out.println(str);
    }
}
