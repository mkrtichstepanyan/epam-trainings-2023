package homework_4.gohar_hakobyan.chapter_7;

public class TestRetOb {
    int a;

    TestRetOb(int i) {
        a = i;
    }

    TestRetOb incrByTen() {
        TestRetOb temp = new TestRetOb(a + 10);
        return temp;
    }
}

