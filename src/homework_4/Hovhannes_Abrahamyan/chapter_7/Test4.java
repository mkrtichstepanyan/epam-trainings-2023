package homework_4.Hovhannes_Abrahamyan.chapter_7;

public class Test4 {
    int a;

    Test4(int i) {
        a = i;
    }

    Test4 incrByTen() {
        Test4 temp = new Test4(a + 10);
        return temp;
    }
}