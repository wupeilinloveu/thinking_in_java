package java07_reuse_class;

/**
 * Created by Emily on 2021/9/26
 */
public class Test19_WithBlankFinalField {
    private final Integer i;
    // The blank final field i may not have been initialized
    public Test19_WithBlankFinalField(int cnt) {
        i = 9;
    }

    public Integer geti() {
        // The final field WithBlankFinalField.i cannot be assigned
//      if(i == null)
//          i = new Integer(47);
        return i;
    }
}
