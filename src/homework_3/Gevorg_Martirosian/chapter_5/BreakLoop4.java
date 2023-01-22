package homework_3.Gevorg_Martirosian.chapter_5;

//using break for exiting from nested loops
public class BreakLoop4 {
    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 3; i++) {
            System.out.print("row " + i + ": ");
            for (int j = 0; j < 100; j++) {
                if (j == 10) {
                    //exit from both loops
                    break outer;
                }
                System.out.print(j + " ");
            }
            System.out.println("this will not print");
        }
        System.out.println("loops ended");
    }
}
