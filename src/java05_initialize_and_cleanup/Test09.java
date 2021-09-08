package java05_initialize_and_cleanup;

/**
 * 编写具有两个（重载）构造器的类，并在第一个构造器中通过this调用第二个构造器。
 * Created by Emily on 2021/9/8
 */
public class Test09 {
    public  Test09(String s,int i){
       this(i);
       System.out.println(s);
    }
    public Test09(int i){
        System.out.println(i);
    }

    public static void main(String[] args) {
       new Test09(2);
        new Test09("Hello",1);
    }
}
