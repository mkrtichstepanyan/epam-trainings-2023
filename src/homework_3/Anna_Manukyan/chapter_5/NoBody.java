package homework_3.Anna_Manukyan.chapter_5;

//Demonstrate while statement
public class NoBody {
    public static void main(String[] args) {
        int i = 100;
        int j = 200;
        while (++i < j--) ;
        System.out.println("Midpoint is " + i);
    }
}
