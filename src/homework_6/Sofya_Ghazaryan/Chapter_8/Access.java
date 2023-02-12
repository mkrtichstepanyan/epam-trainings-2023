package homework_6.Sofya_Ghazaryan.Chapter_8;

public class Access {
    public static void main(String[] args) {
        B_1 subOb = new B_1();

        subOb.setIJ(10, 12);

        subOb.sum();
        System.out.println("Total is " + subOb.total);
    }
}
