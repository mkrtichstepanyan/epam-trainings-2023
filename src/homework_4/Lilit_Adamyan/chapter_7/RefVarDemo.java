package homework_4.Lilit_Adamyan.chapter_7;

public class RefVarDemo {
    public static void main(String[] args) {
        var mc = new MyClass(10);

        System.out.println("Value os i in mc is " + mc.getI());
        mc.setI(19);
        System.out.println("Value of i in mc is now " + mc.getI());
    }
}
