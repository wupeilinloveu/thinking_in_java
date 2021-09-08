package java_initialize_and_cleanup;

/**
 * 编写具有finalize()方法的类，并在方法中打印消息。在main()中为该类创建一个对象，试解释这个程序的行为。
 * 可能不会看到被调用的终结器，因为程序通常不会为收集器生成足够的垃圾来运行。
 * Created by Emily on 2021/9/8
 */
public class Test10 {
    public void finalize() throws Throwable{
        System.out.println("finalize() called");
    }

    public static void main(String[] args) {
        new Test10();
    }
}
