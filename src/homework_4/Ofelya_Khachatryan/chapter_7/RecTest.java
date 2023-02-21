package homework_4.Ofelya_Khachatryan.chapter_7;

public class RecTest {
    int[] values;

    public RecTest(int i) {
        values = new int[i];
    }

    public void printArray(int i) {
        if (i == 0) {
            return;
        } else {
            printArray(i - 1);
        }
        System.out.println("[" + (i - 1) + "] " + values[i - 1]);
    }
}
