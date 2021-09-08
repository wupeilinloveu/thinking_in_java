package java05_initialize_and_cleanup;

/**
 * 编写具有两个方法的类，在第一个方法内调用第二个方法两次：
 * 第一次调用时不使用this关键字，第二次调用时使用this关键字
 * 这里只是为了验证它是起作用的，你不应该在实践中使用这种方法。
 * Created by Emily on 2021/9/8
 */
public class Test08 {
    public static void main(String[] args) {
        Apple apple=new Apple();
        apple.getApple();
    }
}
class Apple{
    public void getApple(){
       System.out.println("为使用this调用");
       createApple();
       System.out.println("使用this调用");
       this.createApple();
    }
    public void createApple(){
        System.out.println("已经创建好");
    }
}
