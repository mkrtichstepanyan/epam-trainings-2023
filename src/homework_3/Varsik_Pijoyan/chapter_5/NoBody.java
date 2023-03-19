package homework_3.Varsik_Pijoyan.chapter_5;

//The target.txt of a loop can be empty
public class NoBody {
    public static void main(String[] args) {
        int i, j;
        i = 100;
        j = 200;
        //find midpoint between i and j
        while (++i < --j) { //no body is in the loop
            System.out.println("Midpoint is " + i);
        }
    }
}
