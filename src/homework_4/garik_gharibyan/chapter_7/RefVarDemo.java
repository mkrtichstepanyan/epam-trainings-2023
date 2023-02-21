package homework_4.garik_gharibyan.chapter_7;

class MyClass {
    private int i;

    MyClass(int k) {
        i = k;
    }

    int getI() {
        return i;
    }

    void setI(int k) {
        if (k >= 0) {
            i = k;
        }

    }
}
public class RefVarDemo {
    public static void main(String[] args) {

        var mc = new MyClass(10);

        System.out.println("Value of i in mc is " + mc.getI());
        mc.setI(19);
        System.out.println("Value of i in mc is now " + mc.getI());
    }
}
