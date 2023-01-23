package homework_3.Galust_Arzumanyan;

// This method is used to demonstrate that program contains an error
public class BreakErr {
    public static void main(String[] args) {
        one:
        {
            for (int i = 0; i < 5; i++) {
                System.out.print( "Pass " + i + ": " );
            }
        }

/*
       for ( int j = 0; j < 77; j++ ) {
         if (j == 10) break one; // WRONG
          System.out.print( j + " " );
*/
    }
}