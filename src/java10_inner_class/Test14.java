package java10_inner_class;

/**
 * 修改interface/HorrorShow.java,用匿名类实现DangerousMonster和Vampire。
 * Created by Emily on 9/28/21
 */
public class Test14 {
    public Test14_Monster getDangerousMonster(){
        return new Test14_Monster() {
            @Override
            public void menace() {
                System.out.println("menace");
            }
            public void destroy(){//扩展的方法
                System.out.println("destroy");
            }
        };
    }
    public Test14_Lethal getVampire(){
        return new Test14_Lethal() {
            @Override
            public void kill() {
                System.out.println("kill");
            }
            public void drinkBlood(){
                System.out.println("drinkBlood");
            }
        };
    }
}
