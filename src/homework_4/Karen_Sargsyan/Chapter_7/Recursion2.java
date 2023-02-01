package homework_4.Karen_Sargsyan.Chapter_7;

public class Recursion2 {
    public static void main(String[] args) {
        RecTest ob = new RecTest(10);
        int i;

        for (i = 0; i < 10; i++) {
            ob.values[i] = i;
        }
        ob.printArray(10);
    }

}
