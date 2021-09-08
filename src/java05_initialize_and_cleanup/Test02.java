package java05_initialize_and_cleanup;

/**
 * 创建一个类，它包含一个在定义时就被初始化了的String域，以及另一个通过构造器初始化的String域。这两种方式有何差异?
 * 差别在于：
 * s1初始化了一次，而s2初始化了两次
 * s1一开始被初始化为”Hello”,而s2先被初始化为null,然后再被初始化为”Word”
 * Created by Emily on 2021/9/8
 */
public class Test02 {
    public static void main(String[] args) {
     Test2 t=new Test2();
     System.out.println(t.s1+" "+t.s2);

     t.s2="Word";
     System.out.println(t.s1+" "+t.s2);
    }
}
class Test2{
    String s1="Hello";
    String s2;
}
