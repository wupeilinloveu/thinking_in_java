package java10_inner_class;

/**
 * 修改第九章中练习18的解决方案，让它使用匿名内部类。
 * Created by Emily on 2021/9/28
 */
public class Test16 {
    public static void getAnCycle(Test16_CycleFactory factory) {
        Test16_Cycle c = factory.getCycle();
        c.ride();
    }

    public static void main(String[] args) {
        getAnCycle(Test16_Unicycle.factory);
        getAnCycle(Test16_Bicycle.factory);
        getAnCycle(Test16_Tricycle.factory);
    }
}
