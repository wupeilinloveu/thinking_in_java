package java07_reuse_class;

/**
 * Created by Emily on 2021/9/26
 */
public class Test17_Frog extends Test17_Amphibian{
    @Override
    public void moveInWater() {
        System.out.println("frog in Water");
    }
    @Override
    public void moveOnLand() {
        System.out.println("frog on Land");
    }
}
