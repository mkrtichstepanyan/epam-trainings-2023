package Eduard_Eghiazaryan.chapter_5;

public class Break {
    public static void main(String[] args) {
        boolean t = true;

        first:
        {
            second:
            {
                third:
                {
                    System.out.println("Before the break statement");
                    if (t) break second;
                    System.out.println("This statement will not be executed");
                }
                System.out.println("This statement will not be executed");
            }
            System.out.println("After the second block");
        }
    }
}
