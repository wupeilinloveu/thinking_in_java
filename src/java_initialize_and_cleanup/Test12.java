package java_initialize_and_cleanup;

/**
 * 编写名为Tank的类，此类的状态可以是“满的”或“空的”。
 * 其终结条件是：对象被清理时必须处于空状态。
 * 请编写finalize()以检验终结条件是否成立。在main()中测试Tank可能发生的几种使用方式。
 * Created by Emily on 2021/9/8
 */
public class Test12 {
    public static void main(String[] args) {
        new Tank().empty();
        new Tank();
        System.gc();
        System.runFinalization();
    }
}
class Tank{
    static int counter;
    int id=counter++;
    boolean full;

    public Tank(){
        System.out.println("Tank "+id+" Created");
        full=true;
    }

    public void empty(){
       full=false;
    }

    @Override
    protected void finalize(){
        if(full) {
            System.out.println("Error: tank " + id + " 必须清理");
        } else {
            System.out.println("Tank " + id + " 清理完成");
        }
    }

    @Override
    public String toString(){
        return "Tank " + id;
    }
}
