package java10_inner_class;

/**
 * Created by Emily on 2021/9/28
 */
public class Test17 {
    public static void playGame(Test17_PlayGame p) {
        Test17_Game game = p.getGame();
        game.play();
    }

    public static void main(String[] args) {
        playGame(Test17_PaoYingBi.playGame);
        playGame(Test17_ZhiShaiZi.playGame);
    }
}
