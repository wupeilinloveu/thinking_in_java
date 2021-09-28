package java10_inner_class;

/**
 * Created by Emily on 2021/9/28
 */
public class Test23_B {
    Test23_U[] array;

    public Test23_B(int size) {
        array = new Test23_U[size];
    }

    public boolean add(Test23_U u) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = u;
                return true;
            }
        }
        return false;
    }

    public boolean setNull(int i) {
        if (i < 0 || i >= array.length) {
            return false;
        }
        array[i] = null;
        return true;
    }

    public void callMethods() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                array[i].f();
                array[i].g();
                array[i].h();
            }
        }
    }
}
