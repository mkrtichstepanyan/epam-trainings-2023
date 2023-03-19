package homework_3.Robert_Nazaryan.chapter_5;

//The target.txt of a loop can be empty
public class NoBody {

    public static void main(String[] args) {

        int i, j;

        i = 100;
        j = 200;
        //find midpoint between i and j
        while (++i < --j) ;//No body in this loop
        System.out.println("Midpoint is  " + i);
    }
}
