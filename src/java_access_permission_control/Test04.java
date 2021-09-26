package java_access_permission_control;

/**
 * protected的访问权限
 * Created by Emily on 2021/9/8
 */
public class Test04 {
    protected void sayHelloProtected() {
        System.out.println("Hello Protected");
    }

    public void sayHelloPublic () {
        System.out.println("Hello Public");
    }

    // 包外无法访问
    void sayHelloPackage() {
        System.out.println("Hello Package");
    }
}
