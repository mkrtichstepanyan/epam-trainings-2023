package homework_3.Andranilk_Sargsyan.chapter_5;

public class ForWar {
    public static void main(String[] args) {
        int i;
        boolean done = false;
        i = 0;
        for (; !done; ) {
            System.out.println("i= " + i);
            if (i == 10) done = true;
            i++;
        }
    }
}
