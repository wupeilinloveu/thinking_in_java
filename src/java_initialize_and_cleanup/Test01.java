package java_initialize_and_cleanup;

/**
 * 创建一个类，它包含一个未初始化的String引用。验证该引用被Java初始化成了null。
 * Created by Emily on 2021/9/8
 */
public class Test01 {
    public static void main(String[] args) {
        Test1 t=new Test1();
        System.out.println(t.str);
    }
}
class Test1{
    String str;
}
