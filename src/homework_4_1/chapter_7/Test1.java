package homework_4_1.chapter_7;

class Test1 {
    int a;

    Test1(int i) {
        a = i;
    }

    Test1 incrByTen() {
        Test1 temp = new Test1(a + 10);
        return temp;
    }

    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }
}
