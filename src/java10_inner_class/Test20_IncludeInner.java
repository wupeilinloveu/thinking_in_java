package java10_inner_class;

/**
 * Created by Emily on 2021/9/28
 */
public interface Test20_IncludeInner {
    class inside{
        static void f(){
            System.out.println("接口嵌套类内部静态方法");
        }
    }
}
