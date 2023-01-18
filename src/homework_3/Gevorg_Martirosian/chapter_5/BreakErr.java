package Gevorg_Martirosian.chapter_5;

//there is error in this code
public class BreakErr {
    public static void main(String[] args) {
        one:
        for (int i = 0; i < 3; i++) {
            System.out.print("row " + i + ": ");
        }

        for (int j = 0; j < 100; j++) {
            if (j == 10) {
//                break one;    error!!!
            }
            System.out.println(j + " ");
        }
    }
}
