package java06_access_permission_control_test;

/**
 * 创建一个带有protected数据的类。运用在第一个类中处理protected数据的方法在相同的文件中创建第二个类。
 * Created by Emily on 2021/9/8
 */
public class Test6 {
    public static void main(String[] args) {
        Data data = new Data();
        System.out.println(data.d);
        new ProcessData().changeData(data);
        System.out.println(data.d);
    }
}
class Data {
    protected int d = 11;
}

class ProcessData {
    public void changeData(Data data) {
        data.d = 22; // 类内处理protected数据
    }
}
