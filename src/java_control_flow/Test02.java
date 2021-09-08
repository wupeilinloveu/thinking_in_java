package java_control_flow;

import java.util.Random;

/**
 * 写一个程序，产生25个int类型的随机数。对于每一个随机数，使用if-else语句来将其分类为大于、小于或等于紧随它而随机生成的值。
 * Created by Emily on 2021/9/8
 */
public class Test02 {
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
        test();
    }
}
