package homework_4.Inesa_Mkrtchyan.Homework4_1.Chapter_7;

public class VarArgs4 {
    static void vaTest(int... v) {
        System.out.println("vaTest(int ... v): " + "Numbers of args: " + v.length + "Contents: ");
        for (int x : v) {
            System.out.println(x + " ");
        }
        System.out.println();
    }

    static void vaTest(boolean... v) {
        System.out.println("vaTest(boolean ... v): " + "Numbers of args: " + v.length + "Contents: ");
        for (boolean x : v) {
            System.out.println(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1,2,3);
        vaTest(true,false,true);
        //vaTest();//error
    }
}
