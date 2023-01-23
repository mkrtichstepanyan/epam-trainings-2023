package homework_3.Galust_Arzumanyan;


// This method is used to demonstrate that loops may be nested
class Nested {
    public static void main(String[] args) {
        int i, j;
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                System.out.print(" . ");
                System.out.println();
            }
        }
    }
}
