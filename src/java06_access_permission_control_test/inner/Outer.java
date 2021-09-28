package java06_access_permission_control_test.inner;

import java06_access_permission_control.inner.InnerClassInterface;

/**
 * Created by Emily on 2021/9/27
 */
public class Outer {
    protected class Inner implements InnerClassInterface {
        public Inner() {//类构造器的访问权限和类访问权限是相同的，因此如果不写public构造器的话，是不能创建Inner对象的，因为Inner不可见
        }

        @Override
        public void show() {
            System.out.println("this is " + this.getClass());
        }
    }
}
