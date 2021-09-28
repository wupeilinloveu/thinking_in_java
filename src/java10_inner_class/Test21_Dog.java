package java10_inner_class;

/**
 * Created by Emily on 2021/9/28
 */
public interface Test21_Dog {
    void bite();
    class action implements Test21_Dog {
        static void f(){
            new action().bite();
        }
        @Override
        public void bite() {
            System.out.println("bite");
        }
    }
}
