package java10_inner_class;

import java06_access_permission_control.inner.InnerClassInterface;
import java06_access_permission_control_test.inner.Outer;

/**
 * Created by Emily on 2021/9/27
 */
public class Test06_ExtendedClass extends Outer {
    public InnerClassInterface getInner() {
        return new Outer().new Inner();
    }
}
