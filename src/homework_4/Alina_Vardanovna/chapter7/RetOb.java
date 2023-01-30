package homework_4.Alina_Vardanovna.chapter7;

public class RetOb {

    int a;

    RetOb(int i) {
        a = i;
    }

    RetOb incrByTen() {
        RetOb temp = new RetOb(a + 10);
        return temp;
    }

}
