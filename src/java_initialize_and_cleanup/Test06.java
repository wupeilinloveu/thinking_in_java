package java_initialize_and_cleanup;

/**
 * 修改前一个练习的程序，让两个重载方法各自接受两个类型的不同的参数，但二者顺序相反。验证其是否工作。
 * Created by Emily on 2021/9/8
 */
public class Test06 {
    public static void main(String[] args) {
        Dog1 d1=new Dog1();
        d1.bark(1,"聪聪");
        d1.bark("毛毛",2);
    }
}
class Dog1{
    public void bark(int age,String name){
        System.out.println("名字："+name+" 年龄："+age+" barking");
    }
    public void bark(String name,int age){
        System.out.println("名字："+name+" 年龄："+age+" barking");
    }
}
