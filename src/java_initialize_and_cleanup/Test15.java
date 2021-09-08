package java_initialize_and_cleanup;

/**
 * 编写一个含有字符串域的类，并采用实例初始化方式进行初始化。
 * Created by Emily on 2021/9/8
 */
public class Test15 {
    String str;
    {
        str = "实例初始化";
    }
    public Test15(){
        System.out.println("默认构造器: " + str);
    }

    public Test15(String str){
        this.str=str;
        System.out.println("构造器: " + str);
    }

    public static void main(String[] args) {
        new Test15();
        new Test15("hello");
    }
}
