package java05_initialize_and_cleanup;

/**
 * 创建一个String对象数组，并为每一个元素都赋值一个String,用for循环来打印该数组。
 * Created by Emily on 2021/9/8
 */
public class Test16 {
    public static void test(){
        String str[] = new String[4];
        str[0] = "Hello";
        str[1] = "how";
        str[2] = "are";
        str[3] = "you";

        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }

        String sa2[] = {
                "These", "are", "some", "strings"
        };
        for (int i = 0; i < sa2.length; i++) {
            System.out.println(sa2[i]);
        }
    }

    public static void main(String[] args) {
        test();
    }
}
