package java_initialize_and_cleanup;

/**
 * 写一个类，它接收一个可变参数的String数组。
 * 验证你可以向该方法传递一个用逗号分隔的String列表，或是一个String[]。
 * Created by Emily on 2021/9/8
 */
public class Test19 {
    static void printStrings(String... str) {
        for (String string : str) {
            System.out.println(string);
        }
    }

    public static void main(String[] args) {
        printStrings("Hello", "are", "you", "ok");
    }
}
