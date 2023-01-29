package homework_4.Robert_Nazaryan.Chapter_7;

public class RefVarDemo {

    public static void main(String[] args) {

        var mc = new MyClass(10); //Notice the use of var here

        System.out.println("Value of i in mc is " + mc.getI());
        mc.setI(19);
        System.out.println("Value of i in mc is now " + mc.getI());
    }
}
