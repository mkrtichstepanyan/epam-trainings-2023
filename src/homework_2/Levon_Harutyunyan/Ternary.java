package homework_2.Levon_Harutyunyan;

public class Ternary {
    public static void main(String[] args) {
        int i = 10;
        int k;
        k = i < 0 ? -i : i;
        System.out.print("Absolute value of ");
        System.out.println(i + " is " + k);

        i = -10;
        k = i < 0 ? -i : i;
        System.out.print("Absolute value of ");
        System.out.println(i + " is " + k);

    }
}
