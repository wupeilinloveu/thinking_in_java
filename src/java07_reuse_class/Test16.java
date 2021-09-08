package java07_reuse_class;

/**
 * 创建一个名为Amphibian的类。由此继承产生一个称为Frog的类。
 * 在基类中设置适当的方法。在main()中，创建一个Frog并向上转型
 * 至Amphibian，然后说明所有方法都可工作。
 * Created by Emily on 2021/9/26
 */
public class Test16 {
    public static void main(String[] args) {
        Test16_Amphibian a = new Test16_Frog();
        a.moveInWater();
        a.moveOnLand();
    }
}
