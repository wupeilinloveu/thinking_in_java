package java10_inner_class;

/**
 * Created by Emily on 2021/9/28
 */
public class Test22_Sequence {
    private Object[] items;
    private int next = 0;

    public Test22_Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length)
            items[next++] = x;
    }

    private class SequenceSelector implements Test22_Selector {
        private int i = 0;
        private final int len = items.length;

        public boolean end() {
            return i == items.length;
        }

        public Object current() {
            return items[len - i - 1];
        }

        public void next() {
            if (i < items.length) i++;
        }
    }

    public Test22_Selector selector() {
        return new SequenceSelector();
    }
}
