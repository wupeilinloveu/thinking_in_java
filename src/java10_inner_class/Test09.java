package java10_inner_class;

/**
 * 创建一个至少有一个方法的接口。在某个方法内定义一个内部类以实现此接口，这个方法返回对此接口的引用。
 * Created by Emily on 2021/9/27
 */
public class Test09 {
    private SimpleInterface get() {
        class simpleImpl implements SimpleInterface {
            public simpleImpl() {
                System.out.println("创建了一个方法内定义的内部类");
            }

            @Override
            public void f() {
                System.out.println("接口的f()方法");
            }
        }
        return new simpleImpl();
    }

    public static void main(String[] args) {
        SimpleInterface simpleInterface = new Test09().get();
    }

    public interface SimpleInterface {
        void f();
    }
}
