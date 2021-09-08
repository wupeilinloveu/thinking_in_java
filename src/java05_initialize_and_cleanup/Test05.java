package java05_initialize_and_cleanup;

/**
 * 创建一个名为Dog的类，它具有重载的bark（）方法。
 * 此方法应根据不同的基本数据类型进行重载，并根据被调用的版本，打印出不同类型的狗吠（barking）、咆哮（howling）等信息。
 * 编写main（）来调用所有不同版本的方法。
 * Created by Emily on 2021/9/8
 */
public class Test05 {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.bark();
        d.bark("花花");
    }
}
class Dog{
    public void bark(){
        System.out.println("barking");
    }

    public void bark(String name){
        System.out.println(name+" howling");
    }
}
