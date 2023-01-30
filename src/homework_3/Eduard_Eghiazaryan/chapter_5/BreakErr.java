package homework_3.Eduard_Eghiazaryan.chapter_5;

public class BreakErr {
    public static void main(String[] args) {
        one:
        for (int i = 0; i < 3; i++) {
            System.out.print("pass through " + i + ": ");
        }
        for (int j = 0; j < 100; j++){
            if (j == 10)
               // break one; // Wrong
            System.out.print(j + " ");
        }
    }
}
