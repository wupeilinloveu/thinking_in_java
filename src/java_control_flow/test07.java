package java_control_flow;

public class test07 {
    //修改本章练习1，通过使用break关键词，使得程序在打印到99时退出。然后尝试使用return来达到相同的目的。
    public static void test(){
      for (int i=0;i<101;i++){
          System.out.println(i);
          if(i==99){
              break;
          }
      }
    }

    public static void main(String[] args) {
        test();
    }
}
