package java_access_permission_control_test;

import java_access_permission_control.Test07_Widget;

/**
 * 根据描述access和Widget的代码片段创建类库。在某个不属于access类库中创建一个Widget实例。
 * Created by Emily on 2021/9/8
 */
public class Test7_Widget {
    public static void main(String[] args) {
        Test07_Widget test07 = new Test07_Widget();
        test07.talk();
    }
}
