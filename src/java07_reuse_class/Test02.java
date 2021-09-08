package java07_reuse_class;

/**
 * 从Detergent中继承产生一个新的类。覆盖scrub() 并添加一个名为sterilize()的新方法。
 * Created by Emily on 2021/9/26
 */
public class Test02 extends Test02_Detergent {
    @Override
    public void scrub() {
        append("Test02.scrub()");
    }

    public void sterilize() {
        append("Test02.sterilize()");
    }

    public static void main(String[] args) {
        Test02 t = new Test02();
        t.dilute();
        t.apply();
        t.scrub();
        t.sterilize();
        System.out.println(t);
    }
}
