package java05_initialize_and_cleanup;

/**
 * 创建一个带默认构造器（即无参构造器）的类，在构造器中打印一条消息。为这个类创建一个对象。
 * Created by Emily on 2021/9/8
 */
public class Test03 {
    public static void main(String[] args) {
        new Test3();
    }
}
class Test3{
    public Test3(){
        System.out.println("这是一个无参构造器");
    }
}
