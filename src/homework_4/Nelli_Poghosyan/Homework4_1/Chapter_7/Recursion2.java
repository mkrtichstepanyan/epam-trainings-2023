package homework_4.Nelli_Poghosyan.Homework4_1.Chapter_7;

class Recursion2 {
    public static void main(String[] args) {
        RecTest ob = new RecTest(10);
        int i;

        for (i = 0; i < 10; i++) ob.values[i] = i;

        ob.printArray(10);
    }
}
