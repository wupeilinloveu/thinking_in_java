package java_access_permission_control_test;

import java_access_permission_control.Test01;

/**
 * 在某个包中创建一个类，在这个类所属的包的外部创建该类的一个实例。
 * Created by Emily on 2021/9/8
 */
public class Test1 {
    public static void main(String[] args) {
        new Test01();
    }
}
