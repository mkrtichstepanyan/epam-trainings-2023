package homework_2.Argishti_Mesropyan;

public class Ternary {
    public static void main(String[] args) {
        int i, k;

        i = 10;
        k = i < 0 ? -i : i;
        System.out.print("Absolute value of");
        System.out.println(i + "  is  " + k);

        i = -10;
        k = i < 0 ? -i : i;
        System.out.print("Absalute value of  ");
        System.out.println(i + " is " + k);
    }
}
