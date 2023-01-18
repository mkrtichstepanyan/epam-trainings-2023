package Gevorg_Martirosian.chapter_5;

//using break for exit from while loop
public class BreakLoop2 {
    public static void main(String[] args) {
        int i = 0;

        while (i < 100) {
            if (i == 10) {
                //when i = 10, we stop the loop
                break;
            }
            System.out.println("i: " + i);
            i++;
        }

        System.out.println("loop is ended");
    }
}
