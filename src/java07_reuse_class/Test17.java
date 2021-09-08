package java07_reuse_class;

/**
 * Created by Emily on 2021/9/26
 */
public class Test17 {
    public static void main(String[] args) {
        Test17_Amphibian a = new Test17_Frog();
        a.moveInWater();
        a.moveOnLand();
    }
}
