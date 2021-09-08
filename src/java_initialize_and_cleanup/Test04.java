package java_initialize_and_cleanup;

/**
 * 为前一个练习中的类添加一个重载构造器，令其接受一个字符串参数，并在构造器中把你自己的信息和接受的参数一起打印出来。
 * Created by Emily on 2021/9/8
 */
public class Test04 {
    public static void main(String[] args) {
        new Test4("Word");
    }
}
class Test4{
    public Test4(String s){
      System.out.println("Hello"+" "+s);
    }
}
