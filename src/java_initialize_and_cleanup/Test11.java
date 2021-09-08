package java_initialize_and_cleanup;

/**
 * 修改前一个练习的程序，让你的finalize()总会被调用。
 * Created by Emily on 2021/9/8
 */
public class Test11 {
    protected void finalize(){
        System.out.println("finalize() called");
    }

    public static void main(String[] args) {
       new Test11();
       System.gc();
       System.runFinalization();
    }
}
