package java10_inner_class;

/**
 * 创建一个接口U，包含三个方法。
 * 创建一个类A，包含一个方法，在此方法中通过创建一个匿名内部类来生成一个指向U的引用。
 * 创建一个类B，包含一个由U组成的数组。B有几个方法，第一个方法接受U的引用，并存储的数组中。第二个方法将数组的引用设置为null，第三个方法遍历此数组，并在U中调用这些方法。
 * 在main()中，创建一组A的对象和一个B的对象。用A类对象产生的U类型的引用填充B对象的数组。使用B回调所有A的对象。再从B中移除某些U的引用。
 * Created by Emily on 2021/9/28
 */
public class Test23 {
    public static void main(String[] args) {
        Test23_A[] aa = {new Test23_A("杨洋"), new Test23_A("热巴"), new Test23_A("吴磊")};
        Test23_B b = new Test23_B(3);
        for (int i = 0; i < aa.length; i++) {
            b.add(aa[i].getU());
        }
        System.out.println("所有的--------------------");
        b.callMethods();

        System.out.println("移除后--------------------\n");

        b.setNull(1);
        b.setNull(2);
        b.callMethods();
    }
}
