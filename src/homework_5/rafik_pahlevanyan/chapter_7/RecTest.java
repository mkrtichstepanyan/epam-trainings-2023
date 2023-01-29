package homework_5.rafik_pahlevanyan.chapter_7;

//Another example that uses recursion
public class RecTest {
    int[] values;

    RecTest(int i) {
        values = new int[i];
    }

    //display array -- recursively
    void printArray(int i) {
        if (i == 0) {
            return;
        } else {
            printArray(i - 1);
        }
        System.out.println("[" + (i - 1) + "]" + values[i - 1]);
    }
}
