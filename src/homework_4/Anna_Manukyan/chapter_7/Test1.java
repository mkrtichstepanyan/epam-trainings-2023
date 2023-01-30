package homework_4.Anna_Manukyan.chapter_7;

//Objects may be passed to methods
public class Test1 {
    int a;

    Test1(int i) {
        a = i;
    }

    Test1 incrByTen() {
        Test1 temp = new Test1(a + 10);
        return temp;
    }

}
