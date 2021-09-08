package java06_access_permission_control_test;

/**
 * 如果将Foreign类置于包中会又是改变。
 * 因为未加限定词的类是包访问权限的, 包外的类无法调用, 所以产生编译错误. 而把类置于类内, 则可以访问.
 * Created by Emily on 2021/9/8
 */
public class Test09 {
    public static void main(String[] args) {
        PackagedClass packagedClass=new PackagedClass();
    }
}

class PackagedClass{
    public PackagedClass(){
        System.out.println("Created a packaged class");
    }
}
