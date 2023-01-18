package Gevorg_Martirosian.chapter_5;

//body of the while loop can be empty
public class NoBody {
    public static void main(String[] args) {
        int i = 100;
        int j = 200;

        //found the middle point between i and j
        while (++i < --j) ;

        System.out.println("middle point is " + i);
    }
}
