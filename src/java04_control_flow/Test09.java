package java04_control_flow;

/**
 * 一个斐波那契数列是由数字1、1、2、3、5、8、13、21、34等等组成的，其中每一个数字（从第三个数字起，都是前两个数字的和）。
 * 创建一个方法，接受一个整数参数，并显示从第一个元素开始总共由该参数指定的个数所构成的所有斐波那契数字。
 * 例如：如果运行java Fibonacci 5（其中Fibonacci是类名），那么输出就应该是1、1、2、3、5
 * Created by Emily on 2021/9/8
 */
public class Test09 {
    public static int Fibonacci(int n){
        if(n==1 || n==2) {
            return 1;
        }else {
            return Fibonacci(n-1)+Fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        for (int i= 1;i<=100;i++){
            System.out.println(Fibonacci(i));
        }
    }
}
