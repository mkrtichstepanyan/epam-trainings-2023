package homework_3.gevorg_arghushyan.chapter_5;

public class ForVar {
    public static void main(String[] args) {
        int i;
        boolean done = false;
        i = 0;
        for ( ; !done; ) {
            System.out.println("i equal " + i);
            if (i == 10) done = true;
            i++;
        }
    }
}
