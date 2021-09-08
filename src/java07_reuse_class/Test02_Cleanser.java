package java07_reuse_class;

/**
 * Created by Emily on 2021/9/26
 */
public class Test02_Cleanser  {
    private String s = "Cleanser ";
    public void append(String a) {
        s += a;
    }

    public void dilute() {
        append("dilute() ");
    }

    public void apply() {
        append("apply() ");
    }

    public void scrub() {
        append("scrub() ");
    }

    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Test02_Cleanser t = new Test02_Cleanser();
        t.dilute();
        t.apply();
        t.scrub();
        System.out.println(t);
    }
}

