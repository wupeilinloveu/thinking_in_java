package java10_inner_class;

/**
 * 在Sequence.SequenceSelector类中增加一个方法，它可以生成对外部类Sequence的引用。
 * Created by Emily on 2021/9/27
 */
public class Test04 {
    public Test04 getTest() {//生成对外部类的引用
        return Test04.this;//不需要外部类的实例
    }
}