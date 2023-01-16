package homework_1.Alina_Vardanovna;

public class Scope {

    public static void main(String[] args) {
        int x;
        x = 10;
        if (x == 10) {
            int y;
            y = 20;
            System.out.println("x-ը և y-ը " + x + "ու " + y + " են");
            x = y * 2;
        }

        /* Եթե գրենք y = 100, ցույց կտա սխալ, քանի որ մենք y-ը ի սկզբանե հայտարարել ենք if-ի սահմաններում,
        իսկ դրանից դուրս այն հասանելի չէ: Բայց x-ը, որը հայտարարել ենք if-ի սահմաններից դուրս, հասանելի է: */

        System.out.println("x-ի արժեքը " + x + " է");

    }

}