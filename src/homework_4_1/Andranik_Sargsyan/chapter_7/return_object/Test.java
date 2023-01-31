package homework_4_1.Andranik_Sargsyan.chapter_7.return_object;

public class Test {
    int a;

    Test(int i) {
        a = i;
    }

    Test incrByTen() {
        Test temp = new Test(a + 10);
        return temp;
    }
}
