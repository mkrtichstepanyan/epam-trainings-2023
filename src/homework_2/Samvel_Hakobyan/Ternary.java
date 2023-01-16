package homework_2.Samvel_Hakobyan;

public class Ternary {
    public static void main(String[] args) {

        int i, k;
        i = 10;
        k = i < 0 ? -i : i;
        System.out.print("absolute value ");
        System.out.println(i + " equals " + k);
        i = -10;
        k = i < 0 ? +i : i;
        System.out.print("absolute value ");
        System.out.println(i + " equals " + k);
    }
}
