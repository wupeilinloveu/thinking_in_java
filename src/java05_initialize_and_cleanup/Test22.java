package java05_initialize_and_cleanup;

/**
 * 在前面的例子中，为enum写一个switch语句，对于每一个case，输出该特定货币的描述。
 * Created by Emily on 2021/9/8
 */
enum PaperCurrencyType {
    ONE, TWO, FIVE, TEN, TWENTY, FIFTY
}

public class Test22 {
    public static void main(String[] args) {
        for (PaperCurrencyType s : PaperCurrencyType.values()) {
            switch (s) {
                case ONE:
                    System.out.println("ONE");
                    break;
                case TWO:
                    System.out.println("TWO");
                    break;
                case FIVE:
                    System.out.println("FIVE");
                    break;
                case TEN:
                    System.out.println("TEN");
                    break;
                case TWENTY:
                    System.out.println("TWENTY");
                    break;
                case FIFTY:
                    System.out.println("FIFTY");
                    break;
                default:
                    System.out.println("defalut");
                    break;
            }
        }
    }
}
