package homework_3.TatevKocharyan.chapter5;

public class BreakLoop3 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.print("Pass " + i + ": ");
            for (int j = 0; j < 100; j++) {
                if (j == 10) {
                    break;
                } else {
                    System.out.print(j + " ");
                }

            }
            System.out.println();

        }
        System.out.println("Loops complete.");
    }
}