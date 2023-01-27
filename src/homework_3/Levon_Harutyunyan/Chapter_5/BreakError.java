package homework_3.Levon_Harutyunyan.Chapter_5;

public class BreakError {
    public static void main(String[] args) {
        one:
        {
            for (int i = 0; i < 3; i++) {
                System.out.print("Pass " + i + ": ");
            }
        }
        for (int j = 0; j < 10; j++){
            if( j == 10) {
//                break one; // wrong
            }

            System.out.print(j + " ");
        }
    }
}
