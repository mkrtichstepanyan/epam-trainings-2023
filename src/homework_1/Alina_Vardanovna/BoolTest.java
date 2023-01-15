package homework_1.Alina_Vardanovna;

public class BoolTest {
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("b-ն " + b + " է");
        b = true;
        System.out.println("b-ն " + b + " է");

        if (b) {
            System.out.println("Սա տպվեց, որովհետև b true է:");
        }

        b = false;
        if (b) {
            System.out.println("Սա չի տպվի, որովհետև b-ն false դարձրինք:");
        }

        System.out.println("10 > 9 " + (10 > 9) + " է");

    }
}
