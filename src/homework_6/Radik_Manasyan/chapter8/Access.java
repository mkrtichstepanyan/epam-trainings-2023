package homework_6.Radik_Manasyan.chapter8;

public class Access {
    public static void main(String[] args) {
        B1 subOb = new B1();
        subOb.setIJ(10, 12);
        subOb.sum();
        System.out.println("Cyммa равна " + subOb.total);
    }
}
