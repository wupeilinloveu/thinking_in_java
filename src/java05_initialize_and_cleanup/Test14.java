package java05_initialize_and_cleanup;

/**
 * 编写一个类，拥有两个静态字符串域，其中一个在定义处初始化，
 * 另一个在静态块中初始化。现在，加入一个静态方法用以打印出两个字段值。
 * 请证明它们都会在被使用之前完成初始化动作。
 * Created by Emily on 2021/9/8
 */
public class Test14 {
    static String s1 = "定义初始化";
    static String s2;
    static {
        s2 = "在静态块在初始化";
    }

    public static void main(String[] args) {
        System.out.println("s1 " + s1);
        System.out.println("s2 " + s2);
    }
}
