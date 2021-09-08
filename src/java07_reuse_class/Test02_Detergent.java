package java07_reuse_class;

/**
 * Created by Emily on 2021/9/26
 */
public class Test02_Detergent extends Test02_Cleanser {
    @Override
    public void scrub() {
        append("Detergent.scrub()");
        super.scrub();
    }

    public void foam() {
        append("foam()");
    }

    public static void main(String[] args) {
        Test02_Detergent t = new Test02_Detergent();
        t.dilute();
        t.apply();
        t.scrub();
        t.foam();
        System.out.println(t);
        Test02_Cleanser.main(args);
    }
}
