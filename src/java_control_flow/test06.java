package java_control_flow;

public class test06 {
    //修改前两个程序中的两个text（）方法，让它们接受两个额外的参数begin和end，这样在测试testval时将判断它是否在begin和end中间（包括begin和end）的范围内。
     public static boolean test(int testval,int begin,int end){
       boolean result=false;
       if (testval>=begin && testval<=end){
            result=true;
       }
       return result;
     }

     public static void main(String[] args) {
          System.out.println(test(8,10,15));
          System.out.println(test(12,5,15));
     }
}
