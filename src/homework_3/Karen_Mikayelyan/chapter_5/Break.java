package homework_3.Karen_Mikayelyan.chapter_5;

// Using break as a civilized form of goto.
public class Break {
    public static void main(String[] args) {
        boolean t = true;

        first:
        {
            second:
            {
                third:
                {
                    System.out.println("Before the break.");
                    if (t) {
                        break second;
                    }
                    System.out.println("This wont execute");
                }
                System.out.println("This wont execute");
            }
            System.out.println("This is after second block.");
        }
    }
}
