package java04_control_flow;

/**
 * 写一个程序，使用两个嵌套的for循环和取余操作符（%）来探测和打印素数（只能被其自身和1整除，而不能被其他数字整除的整数）。
 * Created by Emily on 2021/9/8
 */
public class Test04 {
    public static void test(){
     for (int i=0;i<500;i++){
         int num=0;
         for(int j=1;j<(i+2)/2;j++){
           if((i%j)==0){
               num++; //记录是否出现被整除的数
           }
         }
         if(num<2){ //被1整除记录一次
             System.out.println("数字"+i+"是素数");
         }
     }
    }

    public static void main(String[] args) {
     test();
    }
}
