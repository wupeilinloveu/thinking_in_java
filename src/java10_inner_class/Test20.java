package java10_inner_class;

/**
 * 创建一个包含嵌套类的接口，实现此接口并创建嵌套类的实例。
 * Created by Emily on 2021/9/28
 */
public class Test20 implements Test20_IncludeInner {
    public static void main(String[] args) {
        inside i = new inside();
        i.f();
    }
}
