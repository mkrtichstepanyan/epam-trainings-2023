package homework_4.Samvel_Hakobyan.homework4_1.chapter_7;

public class RefVarDemo {

    public static void main(String[] args) {
        var mc = new MyClass(10);
        System.out.println("Value of i in mc is " + mc.geti());
        mc.seti(19);
        System.out.println("Value of i in mc is now " + mc.geti() );
    }
}

