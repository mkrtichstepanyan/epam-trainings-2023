package homework_4_1.Andranik_Sargsyan.chapter_7.recursion_factorial;

public class Recursion2 {
    public static void main(String[] args) {
        RecTest ob = new RecTest(10);
        for (int i = 0; i < 10; i++) {
            ob.values[i] = i;
            ob.printArray(10);
        }
    }
}
