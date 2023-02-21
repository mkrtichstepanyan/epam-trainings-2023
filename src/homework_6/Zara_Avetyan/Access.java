package homework_6.Zara_Avetyan;

public class Access {
    public static void main(String[] args) {
        B2 subOb = new B2();

        subOb.setij(10, 12);

        subOb.sum();
        System.out.println("Total is " + subOb.total);
    }
}
