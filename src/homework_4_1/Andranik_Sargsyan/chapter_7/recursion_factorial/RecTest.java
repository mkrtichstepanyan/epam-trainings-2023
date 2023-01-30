package homework_4_1.Andranik_Sargsyan.chapter_7.recursion_factorial;

public class RecTest {
    int values[];

    RecTest(int i) {
        values = new int[i];
    }

    void printArray(int i) {

        if (i == 0) {
            return;
        } else {
            printArray(i - 1);
            System.out.println("[" + (i - 1) + "]" + values[i - 1]);
        }
    }
}
