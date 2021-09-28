package java10_inner_class;

/**
 * 创建一个类，它持有一个String，并且有一个显示这个String的toString()方法，
 * 将你的新类的若干个对象添加到一个Sequence对象中，然后显示它们。
 * Created by Emily on 2021/9/27
 */
public class Test02 {
    private Object[] items;
    private int next = 0;

    public Test02(int size) {
        items = new Object[size];
    }

    public void add(Object o) {
        if (next < items.length) {
            items[next++] = o;
        }
    }

    //迭代器设计模式，对外公布一个选择器，可以按照你所设计的顺序访问内部的存储的数据
    //外部使用者不需要关心该类的具体实现，体现了封装的原则
    private class SequenceSelector implements Test02_Selector {//内部类，能访问外部类的所有成员
        private int i = 0;

        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if (i < items.length) {
                i++;
            }
        }
    }

    public Test02_Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Test02 t = new Test02(10);
        for (int i = 0; i < 10; i++) {
            t.add(new Test02_Str(i + ""));
        }
        Test02_Selector selector = t.selector();
        while (!selector.end()) {
            System.out.println(selector.current());
            selector.next();
        }
    }

    /**
     * 在Sequence.SequenceSelector类中增加一个方法，它可以生成对外部类Sequence的引用。
     * Created by Emily on 2021/9/27
     */
    public Test02 getTest() {//生成对外部类的引用
        return Test02.this;//不需要外部类的实例
    }
}
