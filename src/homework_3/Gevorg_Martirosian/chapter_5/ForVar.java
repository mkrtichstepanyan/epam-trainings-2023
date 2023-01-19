package homework_3.Gevorg_Martirosian.chapter_5;

//the parts of for loop can be empty
public class ForVar {
    public static void main(String[] args) {
        int i = 0;
        boolean done = false;

        for (; !done; ) {
            System.out.println("i equals " + i);
            if (i == 10) {
                done = true;
            }
            i++;
        }
    }
}
