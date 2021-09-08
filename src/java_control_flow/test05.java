package java_control_flow;

public class test05 {
    //重复第三章中的练习10，不要用Integer.toBinaryString()方法，而是用三元操作符和按位操作符来显示二进制0和1
    public static void test(int c){
        int d = 0x8000;
        for (int i = 0; i < 16; i++) {
            int out = (c | d) == c ? 1 : 0;//循环比较得出每一位
            System.out.print(out);
            d>>>=1;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int a = 0xAAAA;
        int b = 0x5555;
        int c;
        c = a & b;
        test(c);
        c = a | b;
        test(c);
        c = ~a;
        test(c);
        c = a ^ b;
        test(c);
    }
}
