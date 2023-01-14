package samvel_hakobyan_homework_2;

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
