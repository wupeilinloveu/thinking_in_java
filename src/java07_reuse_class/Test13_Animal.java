package java07_reuse_class;

/**
 * Created by Emily on 2021/9/26
 */
public class Test13_Animal {
    public void eat() {
        System.out.println("eat...");
    }
    public void eat(int i) {
        System.out.println("eat meat...");
    }
    public void eat(String str) {
        System.out.println("eat leaf...");
    }
}
