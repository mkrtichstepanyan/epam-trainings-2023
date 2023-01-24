package homework_3.Vahe_Vardanyan.chapter_5;

public class ForVor {
    public static void main(String[] args) {
        int i;
        boolean done = false;

        i = 0;
        for ( ; !done;){
            System.out.println("i is " + i);
            if (i == 10) done = true;
            i++;
        }
    }
}
