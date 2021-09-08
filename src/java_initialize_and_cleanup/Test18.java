package java_initialize_and_cleanup;

/**
 * 通过创建对象赋值给引用数组，从而完成前一个练习。
 * Created by Emily on 2021/9/8
 */
public class Test18 {
    static StrTest[] arr1 = new StrTest[5];

    public static void main(String[] args) {
        StrTest[] arr2 = new StrTest[5];
        for (int i = 0; i < arr2.length; i++) {
//            arr1[i] = new StrTest("arr1 " + i);
            arr2[i] = new StrTest("arr2 " + i);
        }
    }
}
class StrTest {
    public StrTest(String s) {
        System.out.println("字符串的构造器 s = " + s);
    }
}
