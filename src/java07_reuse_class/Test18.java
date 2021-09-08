package java07_reuse_class;

/**
 * 创建一个含有static final域和final域的类，说明二者间的区别。
 * Created by Emily on 2021/9/26
 */
public class Test18 {
    public static void main(String[] args) {
        System.out.println("First object:");
        System.out.println(new Test18_WithFinalFields());
        System.out.println("Second object:");
        System.out.println(new Test18_WithFinalFields());
    }
}
