package homework_3.Robert_Nazaryan.chapter_5;

//Using break as a civilized form goto
public class Break {

    public static void main(String[] args) {

        boolean t = true;
        first:
        {
            second:
            {
                third:
                {
                    System.out.println("Before the break break.");
                    if (t) {
                        break second; // break out of second block
                    }
                    System.out.println("This won`t execute");
                }
                System.out.println("This won`t execute");
            }
            System.out.println("This is after second block.");
        }
    }
}
