package java07_reuse_class;

/**
 * Created by Emily on 2021/9/26
 */
public class Test06_Chess extends Test06_BoardGame{
    Test06_Chess() {
        super(11);
        System.out.println("Chess constructor");
    }

    public static void main(String[] args) {
        Test06_Chess test06_chess = new Test06_Chess();
    }
}
