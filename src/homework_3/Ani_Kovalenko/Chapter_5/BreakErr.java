package homework_3.Ani_Kovalenko.Chapter_5;

public class BreakErr {
    public static void main(String[] args) {
        one:
        for (int i = 0; i < 3; i++) {
            System.out.println("i = " + i + ": ");
        }
        for (int j = 0; j < 100; j++){
            if(j == 10) break; //one;           // one does not include the break one statement
            System.out.print (j + " ");
        }
    }
}
