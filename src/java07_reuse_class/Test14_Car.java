package java07_reuse_class;

/**
 * 在Car.java中给Engine添加一个service()方法，并在main()中调用该方法。
 * Created by Emily on 2021/9/26
 */
public class Test14_Car {
    public Test14_Engine engine = new Test14_Engine();
    public Test14_Wheel[] wheel = new Test14_Wheel[4];
    public Test14_Door
            left = new Test14_Door(),
            right = new Test14_Door();
    public Test14_Car() {
        for (int i = 0; i < 4; i++) {
            wheel[i] = new Test14_Wheel();
        }
    }
    public static void main(String[] args) {
        Test14_Car car = new Test14_Car();
        car.left.window.rollup();
        car.wheel[0].inflate(72);
        car.engine.service();
    }
}
