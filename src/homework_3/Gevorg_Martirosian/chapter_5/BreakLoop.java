package Gevorg_Martirosian.chapter_5;

//using break for exit from loop
public class BreakLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i == 10) {
                //when i = 10, we stop the loop
                break;
            }
            System.out.println("i: " + i);
        }
        System.out.println("loop is ended");
    }
}
