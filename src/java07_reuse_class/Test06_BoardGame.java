package java07_reuse_class;

/**
 * Created by Emily on 2021/9/26
 */
public class Test06_BoardGame extends Test06_Game{
    Test06_BoardGame(int i) {
        super(i);
        System.out.println("BoardGame constructor");
    }
}
