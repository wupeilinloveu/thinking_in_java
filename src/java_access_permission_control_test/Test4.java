package java_access_permission_control_test;

import java_access_permission_control.Test04;

/**
 * 展示protected方法具有包访问权限，但是它仍旧不是public的。
 * Created by Emily on 2021/9/8
 */
public class Test4  extends Test04 {
    public static void main (String[] str) {
        Test04 t = new Test04();
//        t.sayHelloProtected();
        t.sayHelloPublic();
    }
}
