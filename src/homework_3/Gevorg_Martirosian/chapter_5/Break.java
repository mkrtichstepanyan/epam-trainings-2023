package homework_3.Gevorg_Martirosian.chapter_5;

//using break like a civil version of goto
public class Break {
    public static void main(String[] args) {
        boolean t = true;

        first:
        {
            second:
            {
                third:
                {
                    System.out.println("before break");
                    if (t) {
                        break second;
                    }
                    System.out.println("this operator will not work");
                }
                System.out.println("this operator will not work");
            }
            System.out.println("after second block");
        }
    }
}
