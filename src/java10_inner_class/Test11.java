package java10_inner_class;

/**
 * 创建一个private内部类，让它实现一个public接口。
 * 写一个方法，它返回一个指向此private内部类的实例的引用，并将此引用向上转型为该接口类型。
 * 通过尝试向下转型，说明此内部类被完全隐藏了。
 * Created by Emily on 2021/9/27
 */
public class Test11 {
    private class Inner implements SimpleInterface {
        @Override
        public void f() {
        }
    }

    public SimpleInterface get() {
        return new Inner();
    }

    public Inner get2() {
        return new Inner();
    }


    public interface SimpleInterface {
        void f();
    }
}
