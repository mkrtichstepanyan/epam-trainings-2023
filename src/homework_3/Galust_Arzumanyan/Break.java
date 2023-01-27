package homework_3.Galust_Arzumanyan;


// This method is used to demonstrate using break as a civilized form of goto
class Break {
    public static void main(String[] args) {
        boolean t = true;
        first:
        {
            second:
            {
                third:
                {
                    System.out.println(" Before the break. ");
                    if ( t ) break second; // break out of second block
                    System.out.println(" This won't execute ");
                }
                System.out.println(" This won't execute ");
            }
            System.out.println(" This is after second block ");
        }
    }
}
