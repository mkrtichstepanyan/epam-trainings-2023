package homework_3.garik_gharibyan.chapter_5;

public class BreakErr {
    public static void main(String[] args) {

        one: {
            for (int i = 0; i < 3; i++) {
                System.out.print("pass " + i + ": ");
            }
        }

        System.out.println();

        two: {
            for (int i = 0; i < 100; i++) {
                if (i == 10 ){
       //             break one;    //can not break one
                }
                System.out.print(i + " ");
            }

        }
    }
}
