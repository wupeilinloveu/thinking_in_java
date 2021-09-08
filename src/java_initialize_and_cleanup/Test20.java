package java_initialize_and_cleanup;

/**
 * 创建一个使用可变参数列表而不是普通的main()语法的main()。
 * 打印所产生的args数组的所有元素，并用各种不同数量的命令行参数来测试它。
 * Created by Emily on 2021/9/8
 */
public class Test20 {
    public static void main(String []args)  {
        for(String str:args){
            System.out.println(str);
        }
    }
}
