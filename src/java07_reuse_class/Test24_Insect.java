package java07_reuse_class;

/**
 * Created by Emily on 2021/9/26
 */
public class Test24_Insect {
    private final int i = 9;
    protected int j;
    Test24_Insect() {
        System.out.println("i = " + i + ", j = " + j);
        j = 39;
    }
    private static final int x1 = printInit("static Insect.x1 initialized");
    static int printInit(String s) {
        System.out.println(s);
        return 47;
    }
}
