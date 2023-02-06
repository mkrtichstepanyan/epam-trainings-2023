package homework_5.gevorg_arghushyan.chapter_7;

public class RecTest {
    int [] values;
    RecTest (int i) {
        values = new int[i];
    }
    void printArray (int i) {
        if (i == 0) return;
        else printArray(i - 1);
        System.out.println("[" + (i-1) + "] " + values[i-1]);
    }
}
class Recursion2 {
    public static void main(String[] args) {
        RecTest ob = new RecTest(10);
        int i;
        for (int k = 0; k < 10; k++) {
            ob.values[k] = k;
        }
        ob.printArray(10);
    }
}
