package java07_reuse_class;

/**
 * 请证明加载类的动作仅发生一次。证明该类的第一个实体的创建
 * 或者对static成员的访问都有可能引起加载。
 * Created by Emily on 2021/9/26
 */
public class Test23 {
    public static void main(String[] args) {
        System.out.println("Calling static member");
        Test23_LoadTest.staticMember();
        System.out.println("Creating an object");
        new Test23_LoadTest();
    }
}
