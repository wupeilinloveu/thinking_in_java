package java04_control_flow;

/**
 * 血鬼数字是指位数为偶数的数字，可以由一对数字相乘得到，而这对数字各包含乘积的一半位数的数字，其中从最初的数字中选取的数字可以任意排序。
 * 以两个0结尾的数字是不允许的，例如，下列数字都是“吸血鬼数字”：
 * 1260=21*60
 * 1827=21*87
 * 2187=27*81
 * 写一个程序，找出4位数的所有吸血鬼数字。
 * Created by Emily on 2021/9/8
 */
public class Test10 {
    private int num, len;
    private int [] a;
    private boolean flag;

    Test10(){
        a = new int[100];
        System.out.println("吸血鬼数字");

        for(int i=1000;i<10000;i++){
            if(String.valueOf(i).length()%2 == 1) continue;
            flag = false;
            len = 0;
            num = i;
            int temp = i;
            while(temp > 0){
                a[len++] = temp%10;
                temp /= 10;
            }

            perm(0);
        }
    }

    private void perm(int k){  //生成排列
        if(k == len){
            int xx = 0, yy = 0;
            for(int i=0;i<len/2;i++){
                xx = 10*xx + a[i];
                yy = 10*yy + a[i + len/2];
            }

            if(num == xx*yy && String.valueOf(xx).length() == len/2
                    && String.valueOf(yy).length() == len/2 && !flag){
                System.out.println(num + " = " + xx + " * " +yy);
                flag = true;   //只输出一遍
            }
        }else{
            for(int i=k;i<len;i++){
                swap(k, i);
                perm(k+1);
                swap(i, k);
            }
        }
    }

    private void swap(int i, int j){
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public static void  main(String [] args){
        new Test10();
    }
}
