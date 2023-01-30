package homework_5.garik_gharibyan;

class RecTest {
    int[] values;

    RecTest(int i) {
        values = new int[i];
    }

    void printArray(int a) {
        if (a == 0) {
            return;
        } else {
            printArray(a - 1);
        }
        System.out.println("[" + (a - 1) + "] " + values[a - 1]);
    }
}

public class Recursion2 {
    public static void main(String[] args) {
        RecTest ob = new RecTest(10);
        int i;

        for (int j = 0; j < 1; j++) {
            ob.values[j] = j;
        }

        ob.printArray(10);
    }
}
