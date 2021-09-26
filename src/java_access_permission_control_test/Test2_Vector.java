package java_access_permission_control_test;

import java_access_permission_control.Test02_Vector;

/**
 * 将本节中的代码片段改写为完整的程序，并校验实际所发生的冲突。
 * Created by Emily on 2021/9/8
 */
public class Test2_Vector {
    public static void main(String[] args) {
        Test02_Vector vector = new Test02_Vector();
        java.util.Vector vector2 = new java.util.Vector();
        System.out.println(vector);
        System.out.println(vector2);
    }
}
