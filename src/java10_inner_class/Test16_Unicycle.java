package java10_inner_class;

/**
 * Created by Emily on 2021/9/28
 */
public class Test16_Unicycle implements Test16_Cycle{
    private Test16_Unicycle(){}
    @Override
    public void ride() {
        System.out.println("Unicycle ride");
    }
    public static Test16_CycleFactory factory = new Test16_CycleFactory() {
        @Override
        public Test16_Unicycle getCycle() {
            return new Test16_Unicycle();
        }
    };
}
