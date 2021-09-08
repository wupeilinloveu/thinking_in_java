package java_control_flow;

/**
 * 写一个switch开关语句，为每个case打印一个消息。然后把这个switch放进for循环来测试每个case。
 * 先让每个case后面都有break，测试一下会怎样，然后把break删了，看看会怎样。
 * Created by Emily on 2021/9/8
 */
public class Test08 {
    public static void test(){
        for (int i=1;i<10;i++) {
            switch (i) {
                case 1:
                    System.out.println("case1");
                    break;
                case 2:
                    System.out.println("case2");
                    break;
                case 3:
                    System.out.println("case3");
                    break;
                case 4:
                    System.out.println("case4");
                    break;
                case 5:
                    System.out.println("case5");
                    break;
                default:
                    System.out.println("default");
            }
        }
    }

    public static void main(String[] args) {
        test();
    }
}
