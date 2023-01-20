package homework_3.Hovhannes_Gspeyan.chapter_5;

/**
 * This program uses break
 * as a civilized version
 * of goto
 */
public class Break {
    public static void main(String[] args) {
        boolean t = true;

        first:
        {
            second:
            {
                third:
                {
                    System.out.println("before the break. ");
                    if (t) {
                        break second;
                    }
                    System.out.println("This will not execute. ");
                }
                System.out.println("This won't execute. ");
            }
            System.out.println("This is after second block. ");
        }
    }
}
