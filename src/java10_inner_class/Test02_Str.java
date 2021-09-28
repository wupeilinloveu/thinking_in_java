package java10_inner_class;

/**
 * Created by Emily on 2021/9/27
 */
public class Test02_Str {
    String str;

    public Test02_Str(String s) {
        str = s;
    }

    @Override
    public String toString() {
        return str + " " + str;
    }
}
