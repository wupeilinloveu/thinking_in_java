package java10_inner_class;

/**
 * Created by Emily on 2021/9/28
 */
public class Test17_PaoYingBi implements Test17_Game {
    private Test17_PaoYingBi() {
    }

    @Override
    public void play() {
        System.out.println("抛硬币");
    }

    public static Test17_PlayGame playGame = new Test17_PlayGame() {
        @Override
        public Test17_Game getGame() {
            return new Test17_PaoYingBi();
        }
    };
}
