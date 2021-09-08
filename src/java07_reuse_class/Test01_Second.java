package java07_reuse_class;

/**
 * Created by Emily on 2021/9/23
 */
public class Test01_Second {
    Test01_Simple test01_simple;
    String s;

    public Test01_Second(String s) {
        this.s = s;
    }

    public void check(){
        if (test01_simple==null){
            System.out.println("not initialized");
        }else{
            System.out.println("initialized");
        }
    }

    private Test01_Simple lazy(){
        if(test01_simple == null) {
            System.out.println("Creating Simple");
            test01_simple = new Test01_Simple(s);
        }
        return test01_simple;
    }

    public Test01_Simple getSimple() {
        return lazy();
    }


    public String toString() {
        return lazy().toString();
    }

    public void setSimple(String s) {
        lazy().setS(s);
    }

}
