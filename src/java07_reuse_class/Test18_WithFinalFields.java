package java07_reuse_class;

/**
 * Created by Emily on 2021/9/26
 */
public class Test18_WithFinalFields {
    final Test18_SelfCounter scf = new Test18_SelfCounter();
    static final Test18_SelfCounter scsf = new Test18_SelfCounter();
    public String toString() {
        return "scf = " + scf + "\nscsf = " + scsf;
    }
}
