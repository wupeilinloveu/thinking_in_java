package java10_inner_class;

/**
 * Created by Emily on 2021/9/27
 */
public class Test11_test {
    public static void main(String[] args) {
        Test11 t = new Test11();
        Test11.SimpleInterface simpleInterface = t.get();
        simpleInterface = t.get2();
    }
}
