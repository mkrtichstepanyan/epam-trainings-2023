package homework_1.Alina_Vardanovna;

public class LifeTime {

    public static void main(String[] args) {
        int x;
        for (x = 0; x < 3; x++) {
            int y;
            y = -1;
            System.out.println("y-ի արժեքը" + " " + y + " " + "է");
            y = 100;
            System.out.println("Այժմ y-ի արժեքը" + " " + y + " " + "է");
        }
    }

}
