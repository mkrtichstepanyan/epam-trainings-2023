package homework_4.Yeghia_Ansuryan.Chapter_7.RetOb;

public class Test {
    int a;

    Test (int i){
        a = i;
    }
    Test incrByTen() {
        Test temp = new Test(a + 10);
        return temp;
    }
}
