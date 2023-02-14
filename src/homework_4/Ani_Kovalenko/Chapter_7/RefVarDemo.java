package homework_4.Ani_Kovalenko.Chapter_7;

public class RefVarDemo {
    public static void main (String[] args){
        var mc = new MyClass(10);
        System.out.print("Value of i in mc is " + mc.geti());
        mc.seti(19);
        System.out.print("Value of i in mc is now " + mc.geti());
    }
}
