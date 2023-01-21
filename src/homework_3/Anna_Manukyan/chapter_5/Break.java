package homework_3.Anna_Manukyan.chapter_5;

//Using break as a civilized type of goto
public class Break {
    public static void main(String[] args) {
        boolean t = true;
        first:
        {
            second:
            {
                third:
                {
                    System.out.println("Before break.");
                    if (t) {
                        break second;
                    }
                    System.out.println("This won't execute");
                }
                System.out.println("This won't execute");
            }
            System.out.println("This is after second block");
        }

    }
}
