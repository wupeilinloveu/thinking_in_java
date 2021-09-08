package java07_reuse_class;

/**
 * Created by Emily on 2021/9/26
 */
public class Test03_Cartoon extends Test03_Drawing{
    public Test03_Cartoon() {
        System.out.println("Cartoon constructor");
    }

    public static void main(String[] args) {
        Test03_Cartoon t = new Test03_Cartoon();
    }
}
