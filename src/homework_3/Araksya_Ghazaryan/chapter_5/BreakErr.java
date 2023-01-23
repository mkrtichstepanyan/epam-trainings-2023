package homework_3.Araksya_Ghazaryan.chapter_5;

public class BreakErr {
    public static void main(String[] args) {
            for (int i = 0; i < 3; i++) {
                System.out.println("Pass " + i + ": ");
            }
            for (int j = 0; j < 100; j++) {
                if (j == 10) {
                }
                System.out.println(j + " ");
            }
        }
    }
