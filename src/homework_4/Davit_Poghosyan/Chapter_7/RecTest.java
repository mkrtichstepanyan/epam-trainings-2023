package homework_4.Davit_Poghosyan.chapter_6.Chapter_7;

class RecTest {
    int[] values;

    RecTest(int i){
        values = new int[i];
    }
    void printArray(int i){
        if(i == 0) return;
        else printArray(i - 1);
        System.out.println("[" + (i - 1) + "]" + values[i-1]);
    }
}
