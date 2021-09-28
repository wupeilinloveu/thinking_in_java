package java10_inner_class;

/**
 * 修改练习1，使得Outer类包含一个private string域（由构造器初始化），而Inner包含一个显示这个域的toString()方法。
 * 创建一个Inner类型的对象并显示它。
 * Created by Emily on 2021/9/27
 */
public class Test03 {
    private String str;

    public Test03(String s) {
        str = s;
    }

    class Inner {
        @Override
        public String toString() {
            return str;
        }
    }

    public Inner getInner() {
        return new Inner();
    }

    public static void main(String[] args) {
        String s = "hello word";
        Test03 t = new Test03(s);
        Inner i = t.getInner();
        System.out.println(i.toString());
    }
}
