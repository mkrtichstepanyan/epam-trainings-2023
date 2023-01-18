package homework_3.Roza_Petrosyan.chapter_5;

// Demonstrate the do-while loop.
public class DoWhile {
    public static void main(String[] args) {
        int n = 10;

        do {
            System.out.println("tick " + n);
            n--;
        } while (n > 0);

        // technically correct way

//        do {
//            System.out.println("tick " + n);
//        } while (--n > 0);
    }
}