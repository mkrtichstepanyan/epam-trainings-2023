package homework_3.gevorg_arghushyan.chapter_5;

public class Break {
    public static void main(String[] args) {
        boolean t = true;

        first:
        {
            second:
            {
                third:
                {
                    System.out.println("Before operator break.");
                    if (t) break second;
                    System.out.println("This statement will not be executed.");
                }
            }
            System.out.println("After block second.");
        }

    }
}
