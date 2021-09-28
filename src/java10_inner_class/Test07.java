package java10_inner_class;

/**
 * 创建一个含有private域和private方法的类。创建一个内部类，它有一个方法可用来修改外部类的域，并调用外围类的方法。
 * 在外围类的另一个方法中，创建此内部类的对象，并且调用它的方法，然后说明对外围类对象的影响。
 * Created by Emily on 2020/9/27
 */
public class Test07 {
    private String name ="Emily";
    private void say(){
        System.out.println("Hello");
    }
    public void test(){
        Test07Inner inner = new Test07Inner();
        inner.name();
    }
    class Test07Inner{
        public void name(){
            name =  name+"Wu";
            say();
        }
    }
    public static void main(String[] args){
        Test07 t = new Test07();
        t.test();
        System.out.println(t.name);
    }
}
