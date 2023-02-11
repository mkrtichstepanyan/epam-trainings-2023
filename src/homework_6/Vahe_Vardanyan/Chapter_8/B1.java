package homework_6.Vahe_Vardanyan.Chapter_8;

public class B1 extends A1 {

    int total;

    void sum() {
//        total = i + j; ERROR
    }
}

class Access{
    public static void main(String[] args) {
        B1  subOb = new B1();
        subOb.setij(10,12);

        subOb.sum();
        System.out.println("Total is " + subOb.total);
    }
}
