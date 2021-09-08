package java_control_flow;

import java.util.Random;

/**
 * 修改练习2，把代码用一个while无限循环包括起来。然后运行它直到键盘中断其运行。(通常是通过按Ctrl-C)
 * Created by Emily on 2021/9/8
 */
public class Test03 {
    public static void test(){
        Random rd=new Random();
        int[] num=new int[25];
        for(int i=0;i<25;i++){
            num[i]=rd.nextInt(100);
        }
        for(int j=0;j<24;j++){
                if(num[j]==num[j+1]){
                    System.out.println("当前数"+num[j]+" 等于 "+"紧随它而随机生成的数"+num[j+1]);
                }else if(num[j]<num[j+1]){
                    System.out.println("当前数"+num[j]+" 小于 "+"紧随它而随机生成的数"+num[j+1]);
                }else{
                    System.out.println("当前数"+num[j]+" 大于 "+"紧随它而随机生成的数"+num[j+1]);
                }
        }
    }

    public static void main(String[] args) {
        while (true){
            test();
        }
    }
}
