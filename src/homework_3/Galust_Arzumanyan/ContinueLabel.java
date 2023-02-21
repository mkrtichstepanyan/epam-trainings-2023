package homework_3.Galust_Arzumanyan;


// This method is used to demonstrate using continue with a label
class ContinueLabel {
    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 22; i++) {
            for (int j = 0; j < 22; j++) {
                if (j > 1) {
                    System.out.println();
                    continue outer;
                }
                System.out.print(" " + (i * j));
            }
        }
        System.out.println();
    }
}
