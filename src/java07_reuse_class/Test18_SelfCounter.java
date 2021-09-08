package java07_reuse_class;

/**
 * Created by Emily on 2021/9/26
 */
public class Test18_SelfCounter {
    private static int count;
    private int id = count++;
    public String toString() {
        return "SelfCounter " + id;
    }
}
