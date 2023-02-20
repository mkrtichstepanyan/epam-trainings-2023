package homework_4.Ani_Kovalenko.Chapter_7;

public class VarArgs4 {
    static void vaTest(int... v) {
        System.out.println("vaTest(int ...0: " + "Number of args: " + v.length + " Contents: ");
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void vaTest(boolean... v) {
        System.out.println("vaTest(boolean ...) " + "Number of args: " + v.length + " Contents: ");
        for (boolean x : v){
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static void main (String[] args){
        vaTest (1,2,3);
        vaTest(true, false, false);
        // vaTest();
    }
}
