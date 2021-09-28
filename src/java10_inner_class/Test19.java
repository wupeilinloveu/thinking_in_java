package java10_inner_class;

/**
 * 创建一个包含内部类的类，而此内部类又包含有内部类。使用嵌套类重复这回过程。注意编译器生成的.class文件的名字。
 * Created by Emily on 2021/9/28
 */
public class Test19 {
    static class Bird{
        private String name;
        public Bird(String str){
            name = str;
        }
        static class Chicken{
            void eat(){
                System.out.println("吃小虫");
            }
        }
    }
    public static void main(String[] args){
        Bird.Chicken c = new Bird.Chicken();
        c.eat();
    }
}
