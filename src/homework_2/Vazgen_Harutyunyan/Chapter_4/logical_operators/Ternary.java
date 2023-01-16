package homework_2.Vazgen_Harutyunyan.Chapter_4.logical_operators;

public class Ternary {
    public static void main(String[] args) {
        int i,k;

        i = 10;
        k = i < 0 ? -i : i;
        System.out.print("Absolute value of ");
        System.out.println(i + " is " + k);

        i = -10;
        k = i < 0 ? -i : i;
        System.out.print("Absolute value of ");
        System.out.println(i + " is " + k);
    }
}
