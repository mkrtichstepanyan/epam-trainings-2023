package homework_4.Hovhannes_Gspeyan.chapter_7;

/**
 * test RecTest class
 */
public class Recursion2 {
    public static void main(String[] args) {
        RecTest ob = new RecTest(10);
        int i;

        for(i = 0; i < 10; i++){
            ob.values[i] = i;
        }
        ob.printArray(10);
    }
}
