package homework_3.Zara_Avetyan.Chapter_5;

public class ForVar {
    public static void main(String[] args) {
        int i = 0;
        boolean done = false;
        for (; !done; ) {
            System.out.println("i is " + i);
            if (i == 10) done = true;
            i++;
        }
    }
}
