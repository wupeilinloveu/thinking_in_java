package java07_reuse_class;

/**
 * Created by Emily on 2021/9/26
 */
public class Test11_DetergentDelegation {
    private Test11_Cleanser cleanser = new Test11_Cleanser();
    public void append(String a) {
        cleanser.append(a);
    }
    public void dilute() {
        cleanser.dilute();
    }
    public void apply() {
        cleanser.apply();
    }
    public String toString() {
        return cleanser.toString();
    }
    public void scrub() {
        append(" DetergentDelegation.scrub()");
        cleanser.scrub();
    }
    public void foam() {
        append(" foam()");
    }

    public static void main(String[] args) {
        Test11_DetergentDelegation t = new Test11_DetergentDelegation();
        t.dilute();
        t.apply();
        t.scrub();
        t.foam();
        System.out.println(t);
        System.out.println("Testing base class:");
        Test11_Cleanser.main(args);
    }
}
