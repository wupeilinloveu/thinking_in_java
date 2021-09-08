package java05_initialize_and_cleanup;

/**
 * 创建一个enum,它包含纸币中最小面值的6种类型。通过values()循环并打印每一个值及其ordinal()。
 * Created by Emily on 2021/9/8
 */
enum PaperCurrencyTypes {
    ONE, TWO, FIVE, TEN, TWENTY, FIFTY
}

public class Test21 {
    public static void main(String[] args) {
        for (PaperCurrencyTypes s : PaperCurrencyTypes.values()) {
            System.out.println(s + ", ordinal " + s.ordinal());
        }
    }
}

