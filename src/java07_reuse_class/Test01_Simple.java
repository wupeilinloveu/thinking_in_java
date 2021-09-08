package java07_reuse_class;

/**
 * Created by Emily on 2021/9/23
 */
public class Test01_Simple {
    String s;

    public Test01_Simple(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
}
