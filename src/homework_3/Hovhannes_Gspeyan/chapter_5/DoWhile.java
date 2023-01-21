package homework_3.Hovhannes_Gspeyan.chapter_5;

/**
 * This class demonstrates the
 * do - while loop
 */
public class DoWhile {
    public static void main(String[] args) {
        int n = 10;

        do{
            System.out.println("tick " + n);
            n--;
        }while (n > 0);  //in more efficient way while(--n > 0);

    }
}
