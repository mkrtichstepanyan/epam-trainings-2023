package homework_6.Samvel_Hakobyan.Chapter_8;

public class A1 {
    int i;
    private int j;

    void setij(int x, int y) {
        i = x;
        j = y;
    }
}

class B1 extends A1 {
    int total;

    void sum() {
//        total = i + j; ERROR

    }
}

class Access {
    public static void main(String[] args) {
        B1 subOb = new B1();
        subOb.setij(10, 12);
        subOb.sum();
        System.out.println("Total is " + subOb.total);
    }
}
