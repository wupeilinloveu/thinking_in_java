package java07_reuse_class;

/**
 * 在Beetle.java中，从Beetle类继承产生一个具体类型的“甲壳虫”。其形式与现有类相同，跟踪并解释其输出结果。
 * Created by Emily on 2021/9/26
 */
public class Test24_Beetle extends Test24_Insect{
    public Test24_Beetle() {
        int k = printInit("Beetle.k initialized");
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }
    private static int x2 = printInit("static Beetle.x2 initialized");
    public static void main(String[] args) {
        System.out.println("Beetle constructor");
        Test24_Beetle b = new Test24_Beetle();
    }
}
