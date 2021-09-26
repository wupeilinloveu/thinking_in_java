package java_access_permission_control.test03.debugoff;

/**
 * 不能输出
 * Created by Emily on 2021/9/8
 */
public class Log {
    public static void v(String[] strs) {
        System.out.println("null");
    }
}
