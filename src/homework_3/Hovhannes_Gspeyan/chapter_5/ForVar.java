package homework_3.Hovhannes_Gspeyan.chapter_5;

/**
 * Program demonstrates empty
 * parts of for loop
 */
public class ForVar {
    public static void main(String[] args) {
        int i;
        boolean done = false;

        i = 0;
        for (; !done ;){
            System.out.println("i is " + i);
            if(i == 10){
                done = true;
            }
            i++;
        }
    }
}
