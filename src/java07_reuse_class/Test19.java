package java07_reuse_class;

/**
 * 创建一个含有指向某对象的空白final引用的类。在所有构造器
 * 内部都执行空白final的初始化动作。说明Java确保final在使用前
 * 必须被初始化，且一旦被初始化即无法改变。
 * Created by Emily on 2021/9/26
 */
public class Test19 {
    public static void main(String[] args) {
        Test19_WithBlankFinalField w = new Test19_WithBlankFinalField(10);
        System.out.println(w.geti());
    }
}
