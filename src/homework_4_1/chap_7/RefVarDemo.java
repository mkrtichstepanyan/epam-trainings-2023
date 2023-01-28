package homework_4_1.chap_7;

public class RefVarDemo {
    public static void main(String[] args) {
        var mc = new MyClass(10);
        System.out.println("Value of i in mc is " + mc.geti());
        mc.seti(19);
        System.out.println("Value of i in mc is now " + mc.geti());
    }
}
