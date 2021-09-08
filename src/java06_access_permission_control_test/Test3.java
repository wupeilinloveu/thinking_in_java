package java06_access_permission_control_test;
import static java06_access_permission_control.test03.debug.Log.*;
//import static java_access_permission_control.test03.debugoff.Log.*;
/**
 * 创建两个包：debug和debugoff，它们都包含一个相同的类，该类有一个debug()方法。
 * 第一个版本显示发送给控制台的String参数，而第二个版本什么也不做。
 * 使用静态import语句将该类导入一个测试程序中，并示范条件编译效果。
 * Created by Emily on 2021/9/8
 */
public class Test3 {
    public static void main(String[] args) {
        v(args);
    }
}
