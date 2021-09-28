package java10_inner_class;

/**
 * Created by Emily on 2021/9/28
 */
public class Test22 {
    public static void main(String[] args) {
        Test22_Sequence sequence = new Test22_Sequence(10);
        for (int i = 0; i < 10; i++)
            sequence.add(new Test22_NewClass(Integer.toString(i)).toString());
        Test22_Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.println(selector.current());
            selector.next();
        }
    }
}
