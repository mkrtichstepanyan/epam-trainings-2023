package homework_2.Ani_Kovalenko;

public class Ternary {
    public static void main (String [] args) {
        int i;
        int k;
        i = 10;
        k = i < 0 ? -i : i;
        System.out.println(i + " = " + k);
        i = -10;
        System.out.println(i + " = " + k);
    }
}
