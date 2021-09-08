package java06_access_permission_control;

/**
 * 创建一个带有public，private，protected和包访问权限域以及方法成员的类。
 * Created by Emily on 2021/9/8
 */
public class Test05 {
    public void SayAccessPublic() {
        System.out.println("Public");
    }

    private void SayAccessPrivate() {
        System.out.println("Private");
    }

    protected void SayAccessProtected() {
        System.out.println("Private");
    }

    void SayAccess() {
        System.out.println("Package");
    }
}
