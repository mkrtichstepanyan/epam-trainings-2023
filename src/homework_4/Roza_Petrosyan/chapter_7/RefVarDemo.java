package homework_4.Roza_Petrosyan.chapter_7;

public class RefVarDemo {
    public static void main(String[] args) {
        var mc = new MyClass(10); // Notice the var use here

        System.out.println("Value of i in mc is: " + mc.geti());
        mc.seti(19);
        System.out.println("Value of i in mc now is: " + mc.geti());
    }
}
