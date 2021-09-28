package java10_inner_class;

/**
 * 重复前一个练习，但将内部类定义在某个方法的一个作用域内。
 * Created by Emily on 2021/9/27
 */
public class Test10 {
    private SimpleInterface get() {
        if (true) {
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
        return null;
    }

    public static void main(String[] args) {
        SimpleInterface simpleInterface = new Test10().get();
    }

    public interface SimpleInterface {
        void f();
    }
}
