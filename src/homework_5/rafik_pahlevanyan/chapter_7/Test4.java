package homework_5.rafik_pahlevanyan.chapter_7;

//Returning an object
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