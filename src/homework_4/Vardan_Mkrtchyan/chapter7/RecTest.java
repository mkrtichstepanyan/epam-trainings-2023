package homework_4.Vardan_Mkrtchyan.chapter7;
public class RecTest {
    int[] values;

   public RecTest(int i) {
        values = new int[i];
    }

    public void printArray(int i) {
        if (i == 0) {
            return;
        } else {
            printArray((i - 1));
        }
        System.out.println("[" + (i - 1) + "]" + values[i - 1]);
    }
}
