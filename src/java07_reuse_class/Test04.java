package java07_reuse_class;

/**
 * 证明基类构造器：(a)总是会被调用；(b)在导出类构造器之前被调用。
 * Created by Emily on 2021/9/26
 */
public class Test04 {
    public static void main(String[] args) {
        new Test04_Derived2();
    }
}
