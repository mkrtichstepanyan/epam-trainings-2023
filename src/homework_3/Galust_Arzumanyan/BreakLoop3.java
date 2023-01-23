package homework_3.Galust_Arzumanyan;


// This method is used to demonstrate using break with nested loops
public class BreakLoop3 {
    public static void main(String[] args) {
        int i, j;
        for (i = 0; i < 7; i++) {
            System.out.print(" Pass " + i + " : ");
            for (j = 0; j < 77; j++) {
                if (j == 10) break; // terminate loop of j is 10
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println(" Loops Complete. ");
    }
}
