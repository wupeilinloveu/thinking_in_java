package java07_reuse_class;

/**
 * Created by Emily on 2021/9/26
 */
public class Test11_Cleanser {
    public Test11_Cleanser() {
        System.out.print("Cleanser");
    }

    public void append(String str) {
        System.out.print(" " + str);
    }
    public void dilute() {
        System.out.print(" dilute()");
    }
    public void apply() {
        System.out.print(" apply()");
    }
    public String toString() {
        return "";
    }
    public void scrub() {
        System.out.print(" scrub()");
    }
    public static void main(String[] args) {
        Test11_Cleanser t = new Test11_Cleanser();
        t.dilute();
        t.apply();
        t.scrub();
    }
}
